package com.halo.cache.lock;

import cn.hutool.core.lang.Assert;
import com.halo.cache.AbstractStringCacheStore;
import com.halo.exception.FrequentAccessException;
import com.halo.exception.ServiceException;
import com.halo.utils.ServletUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Configurable;

import javax.annotation.Nonnull;
import java.lang.annotation.Annotation;

/**
 * Interceptor for cache lock annotation.
 *
 * @author johnniang
 * @date 3/28/19
 */
@Slf4j
@Aspect
@Configurable
public class CacheLockInterceptor {

    private static final String CACHE_LOCK_PREFIX = "cache_lock_";

    private static final String CACHE_LOCK_VALUE = "locked";

    private final AbstractStringCacheStore cacheStore;

    public CacheLockInterceptor(AbstractStringCacheStore cacheStore) {
        this.cacheStore = cacheStore;
    }

    @Around("@annotation(com.halo.cache.lock.CacheLock)")
    public Object interceptCacheLock(ProceedingJoinPoint joinPoint)throws Throwable {
        // Get method signature
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        log.debug("Starting locking: [{}]", methodSignature.toString());

        // Get cache lock
        CacheLock cacheLock = methodSignature.getMethod().getAnnotation(CacheLock.class);

        // Build cache lock key
        String cacheLockKey = buildCacheLockKey(cacheLock, joinPoint);

        log.debug("Built lock key: [{}]", cacheLockKey);

        try {
            // Get from cache
            Boolean cacheResult = cacheStore.putIfAbsent(cacheLockKey, CACHE_LOCK_VALUE, cacheLock.expired(), cacheLock.timeUnit());

            if (cacheResult == null) {
                throw new ServiceException("Unknown reason of cache " + cacheLockKey).setErrorData(cacheLockKey);
            }

            if (!cacheResult) {
                throw new FrequentAccessException("访问过于频繁，请稍后再试！").setErrorData(cacheLockKey);
            }

            // Proceed the method
            return joinPoint.proceed();
        }finally {
            // Delete the cache
            if (cacheLock.autoDelete()) {
                cacheStore.delete(cacheLockKey);
                log.debug("Delete the cache lock： [{}]", cacheLock);
            }
        }
    }

    private String buildCacheLockKey(@Nonnull CacheLock cacheLock, @Nonnull ProceedingJoinPoint joinPoint) {
        Assert.notNull(cacheLock, "Cache lock must not be null");
        Assert.notNull(joinPoint, "Proceeding join point must not bei null");

        // Get the method
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        // Build the cache lock key
        StringBuilder cacheKeyBuilder = new StringBuilder(CACHE_LOCK_PREFIX);

        String delimter = cacheLock.delimiter();

        if (StringUtils.isNotBlank(cacheLock.prefix())) {
            cacheKeyBuilder.append(cacheLock.prefix());
        } else {
            cacheKeyBuilder.append(methodSignature.getMethod().toString());
        }

        // Handle cache lock key building
        Annotation[][] parameterAnnotations = methodSignature.getMethod().getParameterAnnotations();

        for (int i = 0; i < parameterAnnotations.length; i++) {
            log.debug("Parameter annotation[{}] = {}", i, parameterAnnotations[i]);

            for (int j = 0; j < parameterAnnotations[i].length; j++) {
                Annotation annotation = parameterAnnotations[i][j];
                log.debug("Parameter annotation[{}{}]: {}", i, j, annotation);
                if (annotation instanceof CacheParam) {
                    //Get current argument
                    Object arg = joinPoint.getArgs()[i];
                    log.debug("Cache param args: [{}]", arg);

                    //Append to the cache key
                    cacheKeyBuilder.append(delimter).append(arg.toString());
                }
            }
        }

        if (cacheLock.traceRequest()) {
            // Append http request info
            cacheKeyBuilder.append(delimter).append(ServletUtils.getRequestIp());
        }

        return cacheKeyBuilder.toString();
    }
}

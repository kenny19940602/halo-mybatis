package com.halo.cache.lock;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Configurable;

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
}

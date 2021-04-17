package com.halo.cache;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.Assert;

import javax.annotation.Nonnull;
import javax.annotation.PreDestroy;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * In-memory cache store.
 *
 * @author johnniang
 */
@Slf4j
public class InMemoryCacheStore extends AbstractStringCacheStore {

    /**
     * Cleaner schedule period. (ms)
     */
    private static final long PERIOD = 60 * 1000;

    /**
     * Cache container.
     */
    private static final ConcurrentHashMap<String, CacheWrapper<String>> CACHE_CONTAINER = new ConcurrentHashMap<>();

    /**
     * Lock
     */
    private final Lock lock = new ReentrantLock();

    private final ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
            new BasicThreadFactory.Builder().namingPattern("CacheExpiryCleaner-schedule-pool-%d").daemon(true).build());

    public InMemoryCacheStore() {
        executorService.scheduleAtFixedRate(new CacheExpiryCleaner(), 0, PERIOD, TimeUnit.MILLISECONDS);
    }

    @Override
    @Nonnull
    Optional<CacheWrapper<String>> getInternal(@Nonnull String key) {
        Assert.hasText(key, "Cache key must not be blank");

        return Optional.ofNullable(CACHE_CONTAINER.get(key));
    }

    @Override
    void putInternal(@Nonnull String key, @Nonnull CacheWrapper<String> cacheWrapper) {
        Assert.hasText(key, "Cache key must not be blank");
        Assert.notNull(cacheWrapper, "Cache wrapper must not be null");

        // Put the cache wrapper
        CacheWrapper<String> putCacheWrapper = CACHE_CONTAINER.put(key, cacheWrapper);

        log.debug("Put [{}] cache result: [{}],original cache wrapper: [{}]", key, putCacheWrapper, cacheWrapper);
    }

    @Override
    Boolean putInternalIfAbsent(@NotNull String key, @NotNull CacheWrapper<String> cacheWrapper) {
        Assert.hasText(key, "Cache key must not be blank");
        Assert.notNull(cacheWrapper, "Cache wrapper must not be null");

        log.debug("Preparing to put key: [{}],value:[{}]", key, cacheWrapper);

        lock.lock();
        try {
            // Get the value before
            Optional<String> valueOptional = get(key);

            if (valueOptional.isPresent()) {
                log.warn("Failed to put the cache, because the key: [{}] has been present already", key);
                return false;
            }

            // Put the cache wrapper
            putInternal(key, cacheWrapper);
            log.debug("Put successfully");
            return true;
        }finally {
            lock.unlock();
        }
    }

    @Override
    public void delete(@Nonnull String key) {
        Assert.hasText(key, "Cache key must not be blank");

        CACHE_CONTAINER.remove(key);
        log.debug("Removed key: [{}]", key);
    }

    @PreDestroy
    public void preDestroy(){
        log.debug("Cancelling all timer tasks");
        executorService.shutdown();
        clear();
    }

    private void clear() {
        CACHE_CONTAINER.clear();
    }

    /**
     * Cache cleaner.
     *
     * @author johnniang
     * @date 03/28/19
     */
    private class CacheExpiryCleaner implements Runnable {
        @Override
        public void run() {
            CACHE_CONTAINER.keySet().forEach(key -> {
                if (!InMemoryCacheStore.this.get(key).isPresent()) {
                    log.debug("Delete the cache : [{}] for expiration", key);
                }
            });
        }
    }

}

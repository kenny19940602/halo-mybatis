package com.halo.cache;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.halo.config.properties.HaloProperties;
import com.halo.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.iq80.leveldb.*;
import org.iq80.leveldb.impl.Iq80DBFactory;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import javax.annotation.Nonnull;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * level-db cache store
 * @author Create by Pencilso on 2020/1/9 7:20 下午
 */
@Slf4j
public class LevelCacheStore extends AbstractStringCacheStore{

    /**
     * Cleaner schedule period. (ms)
     */
    private static final long PERIOD = 60 * 1000;

    private static DB LEVEL_DB;

    public LevelCacheStore(HaloProperties haloProperties) {
        super.haloProperties = haloProperties;
    }

    private final ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
            new BasicThreadFactory.Builder().namingPattern("CacheExpiryCleaner-schedule-pool-%d").daemon(true).build());

    @PostConstruct
    public void init() {
        if (LEVEL_DB != null) {
            return;
        }
        try {
            //work path
            File folder = new File(haloProperties.getWorkDir() + ".leveldb");
            DBFactory factory = new Iq80DBFactory();
            Options options = new Options();
            options.createIfMissing(true);
            //open leveldb store folder
            LEVEL_DB = factory.open(folder, options);
            executorService.scheduleAtFixedRate(new CacheExpiryCleaner(), 0, PERIOD, TimeUnit.MILLISECONDS);

        } catch (Exception ex) {
            log.error("init leveldb error ", ex);
        }
    }

    /**
     * 销毁
     */
    @PreDestroy
    public void preDestroy() {
        try {
            LEVEL_DB.close();
            executorService.shutdown();
        } catch (IOException e) {
            log.error("close leveldb error ", e);
        }
    }

    @Override
    @NonNull
    Optional<CacheWrapper<String>> getInternal(@NonNull String key) {
        Assert.hasText(key, "Cache key must not be blank");
        byte[] bytes = LEVEL_DB.get(stringToBytes(key));
        if (bytes != null) {
            String valueJson = bytesToString(bytes);
            return StringUtils.isEmpty(valueJson) ? Optional.empty() :
                    jsonToCacheWrapper(valueJson);
        }
        return Optional.empty();
    }

    @Override
    void putInternal(@NonNull String key, @NonNull CacheWrapper<String> cacheWrapper) {
        putInternalIfAbsent(key, cacheWrapper);
    }

    @Override
    Boolean putInternalIfAbsent(@NonNull String key, @NonNull CacheWrapper<String> cacheWrapper) {
        Assert.hasText(key, "Cache key must not be blank");
        Assert.notNull(cacheWrapper, "Cache wrapper must not be null");
        try {
            LEVEL_DB.put(
                    stringToBytes(key),
                    stringToBytes(JsonUtils.objectToJson(cacheWrapper))
            );
            return true;
        } catch (JsonProcessingException e) {
            log.warn("Put cache fail json2object key: [{}] value:[{}]", key, cacheWrapper);
        }
        log.debug("Cache key: [{}], original cache wrapper: [{}]", key, cacheWrapper);
        return false;
    }

    @Override
    public void delete(@NonNull String key) {
        LEVEL_DB.delete(stringToBytes(key));
        log.debug("cache remove key: [{}]", key);
    }

    private byte[] stringToBytes(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    private String bytesToString(byte[] bytes) {
        return new String(bytes, Charset.defaultCharset());
    }

    private class CacheExpiryCleaner implements Runnable {

        @Override
        public void run() {
            //batch
            WriteBatch writeBatch = LEVEL_DB.createWriteBatch();

            DBIterator iterator = LEVEL_DB.iterator();
            long currentTimeMillis = System.currentTimeMillis();
            while (iterator.hasNext()) {
                Map.Entry<byte[], byte[]> next = iterator.next();
                if (next.getKey() == null || next.getValue() == null) {
                    continue;
                }

                String valueJson = bytesToString(next.getValue());
                Optional<CacheWrapper<String>> stringCacheWrapper =
                        StringUtils.isEmpty(valueJson) ? Optional.empty() :
                                jsonToCacheWrapper(valueJson);
                if (stringCacheWrapper.isPresent()) {
                    //get expireat time
                    long expireAtTime = stringCacheWrapper.map(CacheWrapper::getExpireAt)
                            .map(Date::getTime)
                            .orElse(0L);
                    //if expire
                    if (expireAtTime != 0 && currentTimeMillis > expireAtTime) {
                        writeBatch.delete(next.getKey());
                        log.debug("deleted the cache: [{}] for expiration",
                                bytesToString(next.getKey()));
                    }
                }
            }
            LEVEL_DB.write(writeBatch);
        }
    }
}

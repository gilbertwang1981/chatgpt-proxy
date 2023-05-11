package cn.com.chatgpt.proxy.config;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.TimedCache;
import cn.hutool.core.date.DateUnit;

public class LocalCache {
    public static final long TIMEOUT = 5 * DateUnit.MINUTE.getMillis();

    private static final long CLEAN_TIMEOUT = 5 * DateUnit.MINUTE.getMillis();

    public static final TimedCache<String, Object> CACHE = CacheUtil.newTimedCache(TIMEOUT);

    static {
        CACHE.schedulePrune(CLEAN_TIMEOUT);
    }
}

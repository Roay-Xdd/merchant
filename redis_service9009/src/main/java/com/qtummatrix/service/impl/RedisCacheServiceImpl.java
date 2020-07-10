package com.qtummatrix.service.impl;

import com.qtummatrix.service.RedisCacheService;
import com.qtummatrix.util.CacheResult;
import com.qtummatrix.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 方法描述: redis缓存service实现类
 * @Author: Shi JiuYue
 * @Date 15:57 2020/7/7
 **/
@Service
public class RedisCacheServiceImpl implements RedisCacheService {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public <V> CacheResult get(String key) {

        return CacheResult.ok(redisUtil.get(key));
    }

    @Override
    public CacheResult set(String key, Object value, long time) {
        return CacheResult.ok(redisUtil.set(key, value, time));
    }

    @Override
    public CacheResult setString(String key, String value, long time) {
        return CacheResult.ok(redisUtil.set(key, value, time));
    }

    @Override
    public CacheResult leftPushAllList(String key, List<Object> value, long time) {
        List ll = (List) value.get(0);
        Long res = redisTemplate.opsForList().leftPushAll(key, ll.toArray());
        if (time > 0) redisTemplate.expire(key, time, TimeUnit.SECONDS);
        return CacheResult.ok(res);
    }

    @Override
    public CacheResult leftPushList(String key, Object value, long time) {
        Long res = redisTemplate.opsForList().leftPush(key, value);
        if (time > 0) redisTemplate.expire(key, time, TimeUnit.SECONDS);
        return CacheResult.ok(res);
    }

    @Override
    public CacheResult rightPopList(String key) {
        Object val = redisTemplate.opsForList().rightPop(key);
        return CacheResult.ok(val);
    }

    @Override
    public CacheResult incr(String key, long delta) {
        return CacheResult.ok(redisUtil.incr(key,delta));
    }


}

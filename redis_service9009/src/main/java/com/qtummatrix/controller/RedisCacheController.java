package com.qtummatrix.controller;


import com.qtummatrix.service.RedisCacheService;
import com.qtummatrix.util.CacheResult;
import com.qtummatrix.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 方法描述: redis服务接口
 * @Author: Shi JiuYue
 * @Date 15:53 2020/7/7
 **/
@RestController

public class RedisCacheController {
    @Autowired
    private RedisCacheService redisCacheService;

    /**
     * 从redis中取
     * @param token
     * @return
     */
    @RequestMapping("/getFromRedis/{token}")
    public CacheResult getFromRedis(@PathVariable("token") String token) {
        CacheResult result = new CacheResult();
        try {
            result = redisCacheService.get(token);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 往redis中存储
     * @param key
     * @param value
     * @param time 时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return
     */
    @RequestMapping("/set")
    public CacheResult setToRedis(@RequestParam("key") String key,
                               @RequestBody Object value,
                               @RequestParam("time") Long time){
        /*
            feign接过来的object类性 都会默认转换为linkedHashMap
         */
        CacheResult result = null;
        try {
            System.out.println("存储对象的类型："+value.getClass());
            result = redisCacheService.set(key, value, time);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 存string类型到redis
     * @param key
     * @param value
     * @param time
     * @return
     */
    @RequestMapping("/setString")
    public CacheResult setStringToRedis(@RequestParam("key") String key,
                                     @RequestParam("value") String value,
                                     @RequestParam("time") Long time){
        CacheResult result = null;
        try {
            result = redisCacheService.setString(key, value, time);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 将list全部内容放入缓存(储存形式为ridis中的list类型)
     * @param key
     * @param value
     * @param time
     * @return
     */
    @RequestMapping("/lpushAll")
    public CacheResult leftPushAllList(@RequestParam("key") String key, @RequestBody List<Object> value, @RequestParam("time") long time){
        CacheResult result = null;
        try {
            result = redisCacheService.leftPushAllList(key, value, time);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 把值存入到list中
     * @param key
     * @param value
     * @param time
     * @return
     */
    @RequestMapping("/lpush")
    public CacheResult leftPushList(@RequestParam("key") String key, @RequestBody Object value, @RequestParam("time") long time){
        CacheResult result = null;
        try {
            result = redisCacheService.leftPushList(key, value, time);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 从list中取出值
     * @param key
     * @return
     */
    @RequestMapping("/lpop")
    public CacheResult rightPopList(@RequestParam("key") String key) {
        CacheResult result = null;
        try {
            result = redisCacheService.rightPopList(key);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 递增
     * @param key
     * @param delta
     * @return
     */
    @RequestMapping("/incr")
    public CacheResult incr(@RequestParam("key") String key, @RequestParam("delta") long delta) {
        CacheResult result = null;
        try {
            result = redisCacheService.incr(key, delta);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }
}

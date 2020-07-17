package com.qtummatrix.service;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "redis-service")
public interface PWL_RedisServer {

    @RequestMapping("/getFromRedis/{token}")
    public CacheResult getFromRedis(@PathVariable("token") String token);

    @RequestMapping("/set")
    public CacheResult setToRedis(@RequestParam("key") String key,
                                  @RequestBody Object value,
                                  @RequestParam("time") Long time);
}

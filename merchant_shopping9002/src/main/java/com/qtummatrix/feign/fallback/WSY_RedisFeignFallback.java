package com.qtummatrix.feign.fallback;

import com.qtummatrix.feign.WSY_RedisFeignService;
import com.qtummatrix.util.CacheResult;
import org.springframework.stereotype.Component;

//@Component
//public class WSY_RedisFeignFallback implements WSY_RedisFeignService {
//    @Override
//    public CacheResult getFromRedis(String token) {
//        return CacheResult.build(400,"getFromRedis请求熔断了……");
//    }
//
//    @Override
//    public CacheResult setToRedis(String key, Object value, Long time) {
//        return CacheResult.build(400,"setToRedis请求熔断了……");
//    }
//
//    @Override
//    public CacheResult setStringToRedis(String key, String value, Long time) {
//        return CacheResult.build(400,"setStringToRedis请求熔断了……");
//    }
//}

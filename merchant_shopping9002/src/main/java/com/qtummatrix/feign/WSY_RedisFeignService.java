package com.qtummatrix.feign;

//import com.qtummatrix.feign.fallback.WSY_RedisFeignFallback;
import com.qtummatrix.util.CacheResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "redis-service")
public interface WSY_RedisFeignService {

    /**
     * 从redis中取
     * @param token
     * @return
     */
    @RequestMapping("/getFromRedis/{token}")
    public CacheResult getFromRedis(@PathVariable("token") String token);

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
                                  @RequestParam("time") Long time);

    /**
     * 存储string类型到redis
     * @param key
     * @param value
     * @param time
     * @return
     */
    @RequestMapping("/setString")
    public CacheResult setStringToRedis(@RequestParam("key") String key,
                                        @RequestParam("value") String value,
                                        @RequestParam("time") Long time);
}

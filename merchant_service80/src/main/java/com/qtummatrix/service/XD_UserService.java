package com.qtummatrix.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "merchant-user" ,fallback = XD_UserServiceApplication.class)
@Hystrix
public interface XD_UserService {
}

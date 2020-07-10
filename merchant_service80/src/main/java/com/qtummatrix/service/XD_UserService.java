package com.qtummatrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "merchant-user" ,fallback = XD_UserServiceApplication.class)
public interface XD_UserService {
}

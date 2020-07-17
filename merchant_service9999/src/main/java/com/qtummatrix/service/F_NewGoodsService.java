package com.qtummatrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "merchant-user" ,fallback = F_NewGoodsServiceImpl.class)
public interface F_NewGoodsService {

    @GetMapping("/fng/getnewgoods")
    public List selectnewgoods();

    @GetMapping("/pro/getBmMember")
    public Object getBmMember(@RequestParam("token") String token);
}

package com.qtummatrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "merchant-shopping")
public interface PWL_UserOfenSalesListServer {

    @RequestMapping("ofenSalesList/getOfenSalesList")
    public List getOfenSalesList(@RequestParam("tel") String tel);

    @RequestMapping("ofenSalesList/getGoodsDetails")
    public List getGoodsDetails(@RequestParam("id")Integer id);
}

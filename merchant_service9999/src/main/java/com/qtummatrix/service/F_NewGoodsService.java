package com.qtummatrix.service;

import com.qtummatrix.entity.F_Address;
import com.qtummatrix.util.MyResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "merchant-user" ,fallback = F_NewGoodsServiceImpl.class)
public interface F_NewGoodsService {

    @GetMapping("/fng/getnewgoods")
    public List selectnewgoods();

    //通过手机号码查询个人信息
    @GetMapping("/pro/getBmMember")
    public Object getBmMember(@RequestParam("token") String token);

    //通过手机号码查询收货地址
    @GetMapping("/pro/getAddress")
    public List getAddress(@RequestParam("token")String token);

    //修改登录密码
    @PostMapping("/pro/updatePwd")
    public MyResult updatePwd(@RequestParam("oldPassword")String oldPassword,
                              @RequestParam("newPassword")String newPassword,
                              @RequestParam("token")String token);
    //修改支付密码
    @PostMapping("/pro/updatePayPassword")
    public MyResult updatePayPassword(@RequestParam("oldPayPassword")String oldPayPassword,
                                      @RequestParam("newPayPassword")String newPayPassword,
                                      @RequestParam("token")String token);
    //删除收货地址
    @PostMapping("/pro/delAddress")
    public MyResult deleteAddress(@RequestParam("addId")Integer addId);

    //添加收货地址
    @PostMapping("/pro/insertAddress")
    public MyResult insertAddress(@RequestParam("address")F_Address address);

    //修改收货地址
    @PostMapping("/pro/updateAddress")
    public MyResult updateAddress(@RequestParam("bmAddress")F_Address bmAddress);

    //查找商家默认收货地址
    @GetMapping("/pro/getDefaultAddress")
    public MyResult findDefaultAddress(@RequestParam("token")String token);

    //修改默认收货地址
    @PostMapping("/pro/updateDefault")
    public MyResult updateDefault(@RequestParam("token")String token,@RequestParam("addId")Integer addId);
}

package com.qtummatrix.controller;

import com.qtummatrix.entity.F_Address;
import com.qtummatrix.service.F_NewGoodsService;
import com.qtummatrix.util.MyResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/fng")
public class F_NewGoodsController {

    @Resource
    private F_NewGoodsService f_newGoodsService;

    /**
     * @方法描述: 获取所有订单
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @RequestMapping("getnewgoods")
    public List selectnewgoods(){
        List list = f_newGoodsService.selectnewgoods();
        return list;
    }

    //通过手机号码查询个人信息
    @GetMapping("getBmMember")
    public Object getBmMember(String token){
        System.out.println(f_newGoodsService.getBmMember(token));
        return f_newGoodsService.getBmMember(token);
    }

    //通过手机号码查询收货地址
    @GetMapping("getAddress")
    public List getAddress(String token){
        return f_newGoodsService.getAddress(token);
    }
    //修改登录密码
    @PostMapping("updatePwd")
    public MyResult updatePwd(String oldPassword,String newPassword,String token){
        return f_newGoodsService.updatePwd(oldPassword,newPassword,token);
    }
    //修改支付密码
    @PostMapping("updatePayPassword")
    public MyResult updatePayPassword(String oldPayPassword,String newPayPassword,String token){
        return f_newGoodsService.updatePayPassword(oldPayPassword,newPayPassword,token);
    }
    //删除收货地址
    @PostMapping("delAddress")
    public MyResult deleteAddress(Integer addId){
        return f_newGoodsService.deleteAddress(addId);
    }

    //添加收货地址
    @PostMapping("insertAddress")
    public MyResult insertAddress(F_Address address){
        return f_newGoodsService.insertAddress(address);
    }

    //修改收货地址
    @PostMapping("updateAddress")
    public MyResult updateAddress(F_Address bmAddress){
        return f_newGoodsService.updateAddress(bmAddress);
    }

    //查找商家默认收货地址
    @GetMapping("getDefaultAddress")
    public MyResult findDefaultAddress(String token){
        return f_newGoodsService.findDefaultAddress(token);
    }

    //修改默认收货地址
    @PostMapping("updateDefault")
    public MyResult updateDefault(String token,Integer addId){
        return f_newGoodsService.updateDefault(token,addId);
    }
}

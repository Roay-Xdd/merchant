package com.qtummatrix.controller;

import com.qtummatrix.service.F_NewGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("api/fng")
public class F_NewGoodsController {

    @Resource
    private F_NewGoodsService f_newGoodsService;

    /**
     * @方法描述: 获取所有订单
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getnewgoods")
    public List selectnewgoods(){
        List list = f_newGoodsService.selectnewgoods();
        return list;
    }
    @ResponseBody
    @GetMapping("getBmMember")
    public Object getBmMember(String token){
        System.out.println(f_newGoodsService.getBmMember(token));
        return f_newGoodsService.getBmMember(token);
    }


}

package com.qtummatrix.controller;

import com.qtummatrix.bean.F_NewGoods;
import com.qtummatrix.service.F_NewGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("fng")
public class F_NewGoodsController {
    @Resource
    private F_NewGoodsService f_newGoodsService;

//    //    解决跨域请求
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//            methods = {RequestMethod.DELETE,RequestMethod.GET,
//                    RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    @GetMapping("getnewgoods")
    public List selectnewgoods(){
        return f_newGoodsService.selectnewgoods();
    }
}

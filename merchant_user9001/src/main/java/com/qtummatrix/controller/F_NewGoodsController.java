package com.qtummatrix.controller;

import com.qtummatrix.bean.F_NewGoods;
import com.qtummatrix.service.F_NewGoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("fng")
public class F_NewGoodsController {
    @Resource
    private F_NewGoodsService f_newGoodsService;

    @GetMapping("getnewgoods")
    public List<F_NewGoods> selectnewgoods(){
        return f_newGoodsService.selectnewgoods();
    }
}

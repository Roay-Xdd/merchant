package com.qtummatrix.controller;


import com.qtummatrix.entity.BmInorderlist;
import com.qtummatrix.service.XD_SecKillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Seckill")
public class XD_SecKillController {

    @Autowired
    private XD_SecKillService xd_secKillService;

    public String shop(BmInorderlist bmInorderlist) {

        return null;

    }

}

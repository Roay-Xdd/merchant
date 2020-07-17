package com.qtummatrix.controller;

import com.qtummatrix.bean.PWL_GoodsDetails;
import com.qtummatrix.bean.PWL_OfenSalesList;
import com.qtummatrix.server.PWL_OfenSalesListServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PWL_OftenBuyListController
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/13 14:33
 * @Version 1.0
 */
@Controller
@RequestMapping("ofenSalesList")
public class PWL_OfenSalesListController {

    @Resource
    private PWL_OfenSalesListServer pwl_ofenSalesListServer;

    /**
     * @方法描述: 查看常购清单
     * @Author panwenlong
     * @Date 17:11 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getOfenSalesList")
    public List<PWL_OfenSalesList> getOfenSalesList(@RequestParam("tel") String tel){
        Map map = new HashMap();
        List<PWL_OfenSalesList> ofenSalesLists = pwl_ofenSalesListServer.getOfenSalesList(tel);
        map.put("ofenSalesLists",ofenSalesLists);
//        return map;
        return  ofenSalesLists;
    }

    /**
     * @方法描述: 查看商品详情
     * @Author panwenlong
     * @Date 17:11 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getGoodsDetails")
    public List<PWL_GoodsDetails> getGoodsDetails(@RequestParam("id")Integer id){
        List<PWL_GoodsDetails> goodsDetails = pwl_ofenSalesListServer.getGoodsDetails(id);
        return goodsDetails;
    }

}

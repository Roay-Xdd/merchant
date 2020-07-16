package com.qtummatrix.controller;

import com.github.pagehelper.PageInfo;
import com.qtummatrix.bean.GoodsInfoBean;
import com.qtummatrix.entity.BmCategory;


import com.qtummatrix.server.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：商品信息Controller
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/13 20:35
 */
@RestController
@RequestMapping(value = "/goodsInfo")
public class GoodsInfoController {

    @Autowired
    private GoodsInfoService goodsInfoService;


    /**
     * 方法描述: 根据商品品牌名称、商品名称得到商品信息
     * @Author: Shi JiuYue
     * @Date 10:33 2020/7/14
     **/
    @GetMapping("/getGoodsInfo")
    public Object getGoodsInfo(Integer pageNo,Integer pageNum,String keyWords){
        String bname = keyWords;
        String goodsName = keyWords;
        PageInfo info = goodsInfoService.getSelectGoodsInfo(pageNo,pageNum,bname,goodsName);
        return  info;
    }

    /**
     * 方法描述: 得到所有的父类目
     * @Author: Shi JiuYue
     * @Date 10:39 2020/7/14
     **/

    @PostMapping("/pCategory")
    public Object getAllPCategoryList(){
        Map<String,Object> map = new HashMap<>();
        List<BmCategory> selectAllPCategoryInfo = goodsInfoService.getSelectAllPCategoryInfo();
        map.put("data",selectAllPCategoryInfo);
        return map;
    }

    /**
     * 方法描述: 得到父id下的所有子类目
     * @Author: Shi JiuYue
     * @Date 10:41 2020/7/14
     **/
    @PostMapping("/childCategoryByPId")
    public Object getAllChildCategoryByParentId(Integer id){
        Map<String,Object>map = new HashMap<>();
        List<BmCategory> allChildCategoryByPId = goodsInfoService.getAllChildCategoryByPId(id);
        map.put("data",allChildCategoryByPId);
        return map;
    }

     /**
      * 方法描述: 得到父类所对应的商品
      * @Author: Shi JiuYue
      * @Date 10:52 2020/7/14
      **/
     @GetMapping("/goodsInfoByCategory")
     public Object getGoodsInfoByCategoryId(Integer pageNo,Integer pageNum,Integer id){


         PageInfo selectGoodsInfoByCateId = goodsInfoService.getSelectGoodsInfoByCateId(pageNo, pageNum, id);

         return selectGoodsInfoByCateId;
     }


     /**
      * 方法描述: 综合、价格、销量
      * @Author: Shi JiuYue
      * @Date 10:58 2020/7/14
      **/
     @GetMapping("/goodsInfoByCategorys")
     public Object getGoodsInfoByCategoryIds(String token, Integer pageNo, Integer pageNum,Integer id,Integer zonghe,
                                             Integer jiage,Integer xiaoliang){
         PageInfo selectGoodsInfoByCateIds = goodsInfoService.getSelectGoodsInfoByCateIds(pageNo, pageNum, id, zonghe, jiage, xiaoliang);
         return selectGoodsInfoByCateIds;
     }


     /**
      * 方法描述: 测试
      * @Author: Shi JiuYue
      * @Date 11:01 2020/7/14
      **/
     @GetMapping(value = "/goodsInfoByCategoryss")
     public Object getGoodsInfoByCategoryIdss(String token,Integer pageNo, Integer pageNum,
      Integer id,Integer zonghe,Integer jiage,Integer xiaoliang) {

        PageInfo info = goodsInfoService.getSelectGoodsInfoByCateIdss(pageNo, pageNum, id, zonghe, jiage, xiaoliang);
        return info;
    }


    /**
     * 方法描述: 根据商品详情id得到商品详情
     * @Author: Shi JiuYue
     * @Date 11:04 2020/7/14
     **/
    @GetMapping("/goodsInfoBySid")
    public Object getGoodsInfoBySid(String token,Integer sid,Integer promotionId){
        Map<String,Object> map=new HashMap<>();
        GoodsInfoBean infoBySid = goodsInfoService.getSelectGoodsInfoBySid(sid);
        map.put("infoSid",infoBySid);
        return map;
    }


    }

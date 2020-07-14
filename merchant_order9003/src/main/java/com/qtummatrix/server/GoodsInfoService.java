package com.qtummatrix.server;


import com.github.pagehelper.PageInfo;
import com.qtummatrix.bean.GoodsInfoBean;
import com.qtummatrix.entity.BmCategory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述： 商品接口
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/13 19:21
 */
public interface GoodsInfoService {

    /**
     * 方法描述: 得到查询商品信息
     * @Author: Shi JiuYue
     * @Date 19:32 2020/7/13
     **/
    PageInfo getSelectGoodsInfo(Integer pageNo, Integer pageNum, String bname, String goodsName);


    /**
     * 方法描述: 得到所有的父类目
     * @Author: Shi JiuYue
     * @Date 19:33 2020/7/13
     **/
    List<BmCategory> getSelectAllPCategoryInfo();

    /**
     * 方法描述: 得到父id下的所有子类目
     * @Author: Shi JiuYue
     * @Date 21:20 2020/7/13
     **/
    List<BmCategory> getAllChildCategoryByPId(Integer categoryId);

    /**
     * 方法描述: 得到所有的父类商品
     * @Author: Shi JiuYue
     * @Date 19:34 2020/7/13
     **/
    PageInfo getSelectGoodsInfoByCateId(Integer pagNo, Integer pageNum, Integer id);

    /**
     * 方法描述: 根据商品详情id得到商品详情信息
     * @Author: Shi JiuYue
     * @Date 19:35 2020/7/13
     **/
    GoodsInfoBean getSelectGoodsInfoBySid(Integer sid);

    /**
     * 方法描述: 得到父类目所对应的商品信息
     * @Author: Shi JiuYue
     * @Date 19:35 2020/7/13
     **/
    PageInfo getSelectGoodsInfoByCateIds(Integer pageNo, Integer pageNum, Integer id, Integer zonghe, Integer jiage, Integer xiaoliang);

    /**
     * 方法描述: 得到父类目所对应的商品信息
     * @Author: Shi JiuYue
     * @Date 19:35 2020/7/13
     **/
    PageInfo getSelectGoodsInfoByCateIdss(Integer pageNo, Integer pageNum, Integer id, Integer zonghe, Integer jiage, Integer xiaoliang);
}

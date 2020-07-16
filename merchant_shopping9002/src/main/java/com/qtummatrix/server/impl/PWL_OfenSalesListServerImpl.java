package com.qtummatrix.server.impl;

import com.qtummatrix.bean.PWL_GoodsDetails;
import com.qtummatrix.bean.PWL_OfenSalesList;
import com.qtummatrix.mapper.PWL_OfenSalesListMapper;
import com.qtummatrix.server.PWL_OfenSalesListServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PWL_OftenBuyListServerImpl
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/13 14:34
 * @Version 1.0
 */
@Service("pwl_ofenSalesListServer")
public class PWL_OfenSalesListServerImpl implements PWL_OfenSalesListServer {

    @Resource
    private PWL_OfenSalesListMapper pwl_ofenSalesListMapper;

    /**
     * @方法描述: 查看常购清单
     * @Author panwenlong
     * @Date 14:44 2020/7/13
    **/
    @Override
    public List<PWL_OfenSalesList> getOfenSalesList(String tel) {
        List<PWL_OfenSalesList> ofenSalesLists = pwl_ofenSalesListMapper.getOfenSalesList(tel);
        return ofenSalesLists;
    }

    /**
     * @方法描述: 商品详情
     * @Author panwenlong
     * @Date 16:16 2020/7/13
    **/
    @Override
    public List<PWL_GoodsDetails> getGoodsDetails(Integer id) {
        List<PWL_GoodsDetails> goodsDetails = pwl_ofenSalesListMapper.getGoodsDetails(id);
        return goodsDetails;
    }
}

package com.qtummatrix.server;

import com.qtummatrix.bean.PWL_GoodsDetails;
import com.qtummatrix.bean.PWL_OfenSalesList;

import java.util.List;

public interface PWL_OfenSalesListServer {

    //    查看常购清单
    public List<PWL_OfenSalesList> getOfenSalesList(String tel);
    //  查看商品详情
    public List<PWL_GoodsDetails> getGoodsDetails(Integer id);

}

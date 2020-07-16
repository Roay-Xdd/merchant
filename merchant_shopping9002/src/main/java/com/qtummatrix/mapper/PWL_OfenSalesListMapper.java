package com.qtummatrix.mapper;

import com.qtummatrix.bean.PWL_GoodsDetails;
import com.qtummatrix.bean.PWL_OfenSalesList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PWL_OfenSalesListMapper {
//    查看常购清单
    public List<PWL_OfenSalesList> getOfenSalesList(String tel);
//  查看商品详情
    public List<PWL_GoodsDetails> getGoodsDetails(Integer id);
}

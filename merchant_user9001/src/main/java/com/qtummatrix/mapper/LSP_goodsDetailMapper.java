package com.qtummatrix.mapper;

import com.qtummatrix.bean.LSP_Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface LSP_goodsDetailMapper {
//    查询品牌id
    List<LSP_Goods> selectBrand();
//    根据品牌id查询商品
    List<LSP_Goods> selectBrandById(Integer brandid);
//    商品详情
    List<LSP_Goods> selectGoods(Integer id);
//    搜索框
    List<LSP_Goods> selectBlur(String bname, String goodsname);

}

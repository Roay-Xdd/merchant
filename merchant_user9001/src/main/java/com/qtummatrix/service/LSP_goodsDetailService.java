package com.qtummatrix.service;

import com.qtummatrix.bean.LSP_Goods;

import java.util.List;

public interface LSP_goodsDetailService {
    List<LSP_Goods> selectBrand();
    List<LSP_Goods> selectBrandById(Integer brandid);
    List<LSP_Goods> selectGoods(Integer id);
    //    搜索框
    List<LSP_Goods> selectBlur(String bname, String goodsname);
}

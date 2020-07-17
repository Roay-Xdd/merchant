package com.qtummatrix.service.impl;

import com.qtummatrix.bean.LSP_Goods;
import com.qtummatrix.mapper.LSP_goodsDetailMapper;
import com.qtummatrix.service.LSP_LoginService;
import com.qtummatrix.service.LSP_goodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class LSP_goodsDetailServiceImpl implements LSP_goodsDetailService {
    @Autowired(required = false)
    private LSP_goodsDetailMapper lsp_goodsDetailMapper;

    @Override
    public List<LSP_Goods> selectBrand() {
        List<LSP_Goods> lsp_goods = lsp_goodsDetailMapper.selectBrand();
        return lsp_goods;
    }

    @Override
    public List<LSP_Goods> selectBrandById(Integer brandid) {
        List<LSP_Goods> lsp_g = lsp_goodsDetailMapper.selectBrandById(brandid);
        return lsp_g;
    }

    @Override
    public List<LSP_Goods> selectGoods(Integer id) {
        List<LSP_Goods> lsp_goods = lsp_goodsDetailMapper.selectGoods(id);

        return lsp_goods;
    }

    @Override
    public List<LSP_Goods> selectBlur(String bname, String goodsname) {
        List<LSP_Goods> lsp = lsp_goodsDetailMapper.selectBlur(bname, goodsname);
        return lsp;
    }
}

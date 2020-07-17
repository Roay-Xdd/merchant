package com.qtummatrix.controller;

import com.qtummatrix.bean.LSP_Goods;
import com.qtummatrix.service.LSP_goodsDetailService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
//    解决跨域请求
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
        methods = {RequestMethod.DELETE,RequestMethod.GET,
                RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
@RestController
@RequestMapping("selectGoodsDetail")
public class LSP_goodsDetailController {
    @Resource
    private LSP_goodsDetailService lsp_goodsDetailService;
    @RequestMapping("selectGoods")
    public List<LSP_Goods> selectGoods(Integer id){
        List<LSP_Goods> lsp_goods = lsp_goodsDetailService.selectGoods(id);
        return lsp_goods;
    }
    @RequestMapping("selectBrand")
    public List<LSP_Goods> selectBrand(){
        List<LSP_Goods> lsp_good = lsp_goodsDetailService.selectBrand();
        return lsp_good;
    }
    @RequestMapping("selectBrandById")
    public List<LSP_Goods> selectBrandById(Integer brandid){
        List<LSP_Goods> lsp_good = lsp_goodsDetailService.selectBrandById(brandid);
        return lsp_good;
    }
    @RequestMapping("selectBlur")
    public List<LSP_Goods> selectBlur(String bname,String goodsname){
        List<LSP_Goods> lsp = lsp_goodsDetailService.selectBlur(bname,goodsname);
        return lsp;
    }
}

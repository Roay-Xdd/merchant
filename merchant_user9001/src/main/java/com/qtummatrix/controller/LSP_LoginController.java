package com.qtummatrix.controller;

import com.qtummatrix.LSPBean.SupplyResult;
import com.qtummatrix.service.LSP_LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//    解决跨域请求
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
        methods = {RequestMethod.DELETE,RequestMethod.GET,
                RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
@Controller
@RequestMapping("selectTel")
public class LSP_LoginController {
    @Autowired
    private LSP_LoginService lsp_loginService;
    @PostMapping("BmmeberLogin")
    @ResponseBody
    public SupplyResult selectBmmeber(String tel, String password,
                                      HttpServletRequest request, HttpServletResponse response){

        SupplyResult supplyResult = lsp_loginService.selectBmmeber(tel, password, request, response);

        return supplyResult;
    }
    @PostMapping("updateBmmeber")
    @ResponseBody
    public  SupplyResult updateBmmeber(String oldPassword, String newPassword,String token){
        SupplyResult supplyResult = lsp_loginService.updateBmmeber(oldPassword, newPassword,token);
        return  supplyResult;
    }
    @PostMapping("registBmmeber")
    @ResponseBody
    public SupplyResult registBmmeber(String truename, String tel, String businessname, String address){
        SupplyResult supplyResult = lsp_loginService.registBmmeber(truename, tel, businessname, address);
        return supplyResult;
    }
}

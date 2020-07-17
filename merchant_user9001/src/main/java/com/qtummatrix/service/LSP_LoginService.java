package com.qtummatrix.service;

import com.qtummatrix.LSPBean.SupplyResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LSP_LoginService {
//    登录
    SupplyResult selectBmmeber(String tel, String password,
                               HttpServletRequest request, HttpServletResponse reponse);

//    修改密码
    SupplyResult updateBmmeber(String oldPassword, String newPassword, String token);
//    注册
    SupplyResult  registBmmeber(String truename, String tel, String businessname, String address);
}

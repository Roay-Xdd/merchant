package com.qtummatrix.service.impl;

import com.qtummatrix.LSPBean.SupplyResult;
import com.qtummatrix.entity.BmMember;
import com.qtummatrix.mapper.LSP_LoginMapper;
import com.qtummatrix.service.LSP_LoginService;
import com.qtummatrix.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LSP_LoginServiceImpl implements LSP_LoginService {
    @Autowired(required = false)
    private LSP_LoginMapper lsp_loginMapper;

    @Autowired
    private RedisUtil redisUtil;
    @Override
    public SupplyResult selectBmmeber(String tel, String password,
                                       HttpServletRequest request, HttpServletResponse response) {

        BmMember bmMembers = lsp_loginMapper.selectTel(tel);
        if (bmMembers==null||bmMembers.equals("")){
            return SupplyResult.build(500,"用户名或密码错误");
        }
        if(!bmMembers.getPassword().equals(password)){
            return SupplyResult.build(500,"用户名或密码错误");
        }
        //密码匹配，清空密码（安全）
        bmMembers.setPassword(null);
        String token = bmMembers.getToken();
        //将用户存入到redis中,并且设置过期时间为一天
        redisUtil.set(token,bmMembers,new Long(60*60*24));
        //添加cookie,cookie的有效期是关闭浏览器失效
        Cookie cookie = new Cookie("MERCHANT_TOKEN",token);
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);

        return SupplyResult.ok(token);
    }
//修改密码
    @Override
    public SupplyResult updateBmmeber(String oldPassword, String newPassword,String token) {
        int i = lsp_loginMapper.updatePass(token, newPassword);
        if (i==1){
            return SupplyResult.build(200,"修改成功");
        }
        return SupplyResult.build(500,"修改失败");
    }

    @Override
    public SupplyResult registBmmeber(String truename, String tel, String businessname, String address) {
        int regist = lsp_loginMapper.regist(truename, tel, businessname, address);
        if (regist==1){
           return SupplyResult.ok("添加成功");
        }
        return SupplyResult.build(500,"添加失败");
    }

}

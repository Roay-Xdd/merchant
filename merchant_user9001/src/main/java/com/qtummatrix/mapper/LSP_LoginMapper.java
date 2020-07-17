package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LSP_LoginMapper {
//    登录
    BmMember selectTel(String tel);
//    修改密码
    int updatePass(@Param("token") String token, @Param("newPassword") String newPassword);
//注册
    int regist(@Param("truename") String truename, @Param("tel") String tel, @Param("businessname") String businessname, @Param("address") String address);
}

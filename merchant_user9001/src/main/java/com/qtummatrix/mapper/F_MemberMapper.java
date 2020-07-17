package com.qtummatrix.mapper;

import com.qtummatrix.bean.F_Address;
import com.qtummatrix.bean.F_Member;
import com.qtummatrix.bean.MyResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface F_MemberMapper {
    /**
     * 通过手机号码查询商户信息
     * @param token 手机号码
     * @return
     */
    F_Member selectByPrimaryTel(String token);
    /**
     * 修改登录密码,支付密码
     * @param token
     * @param newPassword
     * @return
     */
    int updatePwd(@Param("newPassword") String newPassword, @Param("token") String token);
    int updatePayPassword(@Param("newPayPassword") String newPayPassword, @Param("token") String token);
    /**
     * 查询收货地址
     * @param token
     * @return
     */
    List<F_Address> getAddress(String token);
    /**
     * 修改收货地址
     * @param bmAddress 收货地址信息
     * @return
     */
    Integer updateAddress(F_Address bmAddress);

    /**
     * 添加收货地址
     * @param bmAddress 收货地址信息
     * @return
     */
    Integer insertAddress(F_Address bmAddress);

//    Integer addAddress(F_Address bmAddress);

    /**
     * 删除收货地址
     * @param addid 收货地址id
     * @return
     */
    Integer deleteAddress(Integer addid);

    //查询默认地址
    public List<F_Address> findDefaultAddress(String token);
    //查询商家所有收货地址
    List<F_Address> listBySellerId(Integer SellerId);
    /**
     * 修改默认收货地址
     * @param addId
     * @return
     */
    public Integer updateDefault(Integer addId);
}

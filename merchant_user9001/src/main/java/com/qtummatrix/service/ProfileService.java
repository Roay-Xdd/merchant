package com.qtummatrix.service;

import com.qtummatrix.bean.F_Address;
import com.qtummatrix.bean.F_Member;
import com.qtummatrix.bean.MyResult;

import java.util.List;

public interface ProfileService {
    /**
     * 通过手机号码查询个人信息
     * @param token 手机号码
     * @return
     */
    F_Member selectByPrimaryTel(String token);

    /**
     * 修改登录密码,支付密码
     * @param token
     * @param oldPassword
     * @param newPassword
     * @return
     */
    MyResult updatePwd(String oldPassword, String newPassword, String token);
    MyResult updatePayPassword(String oldPayPassword,String newPayPassword,String token);
    /**
     * 查询收货地址
     * @param token
     * @return
     */
    List<F_Address> getAddress(String token);

    /**
     * 添加收货地址
     * @param address 收货地址信息
     * @return
     */
    public Integer insertAddress(F_Address address);

    /**
     * 上传及更新商家头像
     * @param backImg
     * @param id
     * @return
     */
    public MyResult updateSellerBackImg(String backImg,Integer id);

    /**
     * 修改收货地址
     * @param bmAddress 收货地址信息
     * @return
     */
    Integer updateAddress(F_Address bmAddress);
//    public MyResult editAddress(F_Address address);

    /**
     * 删除收货地址
     * @param addid 收货地址id
     * @return
     */
    Integer deleteAddress(Integer addid);

    /**
     * 修改默认地址
     * @param addId
     * @return
     */
    public Integer updateDefault(String token,Integer addId);



    //通过token查询商家默认地址
    public List<F_Address> findDefaultAddress(String token);
}

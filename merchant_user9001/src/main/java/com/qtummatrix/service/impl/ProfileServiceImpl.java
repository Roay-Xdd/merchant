package com.qtummatrix.service.impl;

import com.qtummatrix.bean.F_Address;
import com.qtummatrix.bean.F_Member;
import com.qtummatrix.bean.MyResult;
import com.qtummatrix.mapper.F_MemberMapper;
import com.qtummatrix.service.ProfileService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Resource
    private F_MemberMapper f_memberMapper;

    //通过手机号码查询个人信息
    @Override
    public F_Member selectByPrimaryTel(String token) {
        return f_memberMapper.selectByPrimaryTel(token);
    }

    //更改密码
    @Override
    public MyResult updatePwd(String oldPassword, String newPassword, String token) {
        F_Member bmMember = f_memberMapper.selectByPrimaryTel(token);
        MyResult myResult = null;
        int rows = 0;
        if (oldPassword.equals(bmMember.getPassword())){
            if (!newPassword.equals(bmMember.getPassword())){
                rows = f_memberMapper.updatePwd(newPassword,token);
                myResult = new MyResult(200,"密码修改成功！",rows);
            }else {
                myResult= new MyResult(500,"新登陆密码和旧密码不能相同！",-1);
            }
        }else {
            myResult= new MyResult(500,"旧密码输入不正确！请重新输入",-1);
        }
        return myResult;
    }
    //更改支付密码
    @Override
    public MyResult updatePayPassword(String oldPayPassword,String newPayPassword,String token){
        F_Member bmMember = f_memberMapper.selectByPrimaryTel(token);
        MyResult myResult = null;
        int rows = 0;
        if (oldPayPassword.equals(bmMember.getPayPassword())){
            if (!newPayPassword.equals(bmMember.getPassword())){
                rows = f_memberMapper.updatePayPassword(newPayPassword, token);
                myResult = new MyResult(200,"密码修改成功！",rows);
            }else {
                myResult= new MyResult(500,"新登陆密码和旧密码不能相同！",-1);
            }
        }else {
            myResult= new MyResult(500,"旧密码输入不正确！请重新输入",-1);
        }
        return myResult;
    }

    //通过手机号码查询收货地址
    @Override
    public List<F_Address> getAddress(String token) {
        return f_memberMapper.getAddress(token);
    }
    //修改收货地址
    @Override
    public Integer updateAddress(F_Address bmAddress) {
        return f_memberMapper.updateAddress(bmAddress);
    }

    //添加收货地址
    @Override
    public Integer insertAddress(F_Address address) {

        return f_memberMapper.insertAddress(address);
    }
    //更改头像，待定
    @Override
    public MyResult updateSellerBackImg(String backImg, Integer id) {
        return null;
    }

    //删除地址
    @Override
    public Integer deleteAddress(Integer addid) {
        return f_memberMapper.deleteAddress(addid);
    }

    //更改默认地址
    @Transactional
    @Override
    public Integer updateDefault(String token,Integer addId) {
        Integer qwe = 0;
        F_Member bmMember = f_memberMapper.selectByPrimaryTel(token);
        List<F_Address> list = f_memberMapper.listBySellerId(bmMember.getId());
        for (F_Address addr:list) {
            addr.setIsDefault(0);
            f_memberMapper.updateAddress(addr);
        }
        for (F_Address addr:list){
            if (addr.getAddId().equals(addId)){
                addr.setIsDefault(1);
                 qwe = f_memberMapper.updateAddress(addr);

            }

        }

        return qwe;
    }
    //通过token查询商家默认地址
    @Override
    public List<F_Address> findDefaultAddress(String token) {

        return f_memberMapper.findDefaultAddress(token);
    }



}

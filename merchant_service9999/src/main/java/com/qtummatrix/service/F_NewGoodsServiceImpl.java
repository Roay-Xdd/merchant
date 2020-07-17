package com.qtummatrix.service;

import com.qtummatrix.entity.F_Address;
import com.qtummatrix.util.MyResult;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public class F_NewGoodsServiceImpl implements F_NewGoodsService{

    @Override
    public List selectnewgoods() {

        return null;
    }

    @Override
    public Object getBmMember(String token) {
        return null;
    }

    @Override
    public List getAddress(String token) {
        return null;
    }

    @Override
    public MyResult updatePwd(String oldPassword, String newPassword, String token) {
        return null;
    }

    @Override
    public MyResult updatePayPassword(String oldPayPassword, String newPayPassword, String token) {
        return null;
    }

    @Override
    public MyResult deleteAddress(Integer addId) {
        return null;
    }

    @Override
    public MyResult insertAddress(F_Address address) {
        return null;
    }

    @Override
    public MyResult updateAddress(F_Address bmAddress) {
        return null;
    }

    @Override
    public MyResult findDefaultAddress(String token) {
        return null;
    }

    @Override
    public MyResult updateDefault(String token, Integer addId) {
        return null;
    }
}

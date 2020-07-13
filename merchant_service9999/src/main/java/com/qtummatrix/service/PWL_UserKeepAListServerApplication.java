package com.qtummatrix.service;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName PWL_UserKeepAListServerApplication
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/13 19:24
 * @Version 1.0
 */
@Component
public class PWL_UserKeepAListServerApplication implements PWL_UserKeepAListServer{
    @Override
    public Map getOrderList(String tel) {
        return null;
    }

    @Override
    public Map getNoPayList(String tel) {
        return null;
    }

    @Override
    public Map getNoInspectionList(String tel) {
        return null;
    }

    @Override
    public Map getNoSureList(String tel) {
        return null;
    }

    @Override
    public Map getCompletedList(String tel) {
        return null;
    }

    @Override
    public Map getOrderDetail(String orderId) {
        return null;
    }
}

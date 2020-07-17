package com.qtummatrix.server;

import com.qtummatrix.bean.WSY_CheckOutBean;

public interface SendOrder {
    // 单队列
    void  send(String token, String addressId, String mark,String  checkOut);
}

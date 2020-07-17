package com.qtummatrix.server;

public interface SendBuy {
    void  send(String token ,String orderId ,Integer payType,Integer money);
}

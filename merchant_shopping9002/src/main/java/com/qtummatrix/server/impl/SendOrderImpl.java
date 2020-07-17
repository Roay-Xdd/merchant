package com.qtummatrix.server.impl;



import com.netflix.discovery.converters.Auto;
import com.qtummatrix.bean.WSY_CheckOutBean;
import com.qtummatrix.server.SendOrder;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SendOrderImpl implements SendOrder,RabbitTemplate.ConfirmCallback,RabbitTemplate.ReturnCallback {


    // 注入rabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    // 单队列
    @Override
    public void send(String token, String addressId, String mark, String checkOut){
        // 转换和发送 名字和对象
        rabbitTemplate.convertAndSend("order", token+"_"+addressId+"_"+mark+"_"+checkOut);

    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {

    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {

    }
}

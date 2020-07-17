package com.qtummatrix.server.impl;



import com.qtummatrix.server.SendBuy;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SendBuyImpl implements SendBuy ,RabbitTemplate.ConfirmCallback,RabbitTemplate.ReturnCallback{


    // 注入rabbitTemplate

    private RabbitTemplate rabbitTemplate;

    // 单队列
    @Override
    public void send(String token ,String orderId ,Integer payType,Integer money){


        // 转换和发送 名字和对象
        rabbitTemplate.convertAndSend("buy" , token+"_"+orderId+"_"+payType+"_"+money);
    }

    //回调
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        if(ack){

        }else{

        }

    }
//消息发送到转换器的时候没有对列,配置了备份对列该回调则不生效
    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {

    }
}

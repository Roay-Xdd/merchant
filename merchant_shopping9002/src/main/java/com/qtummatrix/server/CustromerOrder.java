package com.qtummatrix.server;


import org.apache.ibatis.annotations.Param;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "merchant-shopping" )
@RabbitListener(queuesToDeclare = @Queue("order"))
public interface CustromerOrder {

    @RabbitHandler
    @RequestMapping("cart/toPay")
    void toPay(@Param("orderId") String orderid, @Param("payType") Integer payType);
}

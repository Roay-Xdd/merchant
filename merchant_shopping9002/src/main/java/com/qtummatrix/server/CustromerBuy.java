package com.qtummatrix.server;


import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "merchant-shopping" )
@RabbitListener(queuesToDeclare = @Queue("buy"))
public interface CustromerBuy {



}

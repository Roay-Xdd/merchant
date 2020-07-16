package com.qtummatrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RabbitMQ_ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMQ_ServiceApplication.class,args);
    }
}

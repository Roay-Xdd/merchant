package com.qtummatrix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.qtummatrix.mapper")
public class Merchant_shopping9002 {
    public static void main(String[] args) {
        SpringApplication.run(Merchant_shopping9002.class,args);
    }
}
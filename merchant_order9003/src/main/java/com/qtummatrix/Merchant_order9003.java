package com.qtummatrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Merchant_order9003 {
    public static void main(String[] args) {
        SpringApplication.run(Merchant_order9003.class,args);
    }
}
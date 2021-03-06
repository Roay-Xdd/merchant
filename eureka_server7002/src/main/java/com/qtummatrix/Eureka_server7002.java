package com.qtummatrix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka_server7002 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka_server7002.class,args);
    }
}

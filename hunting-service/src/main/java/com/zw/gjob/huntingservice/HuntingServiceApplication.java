package com.zw.gjob.huntingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HuntingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuntingServiceApplication.class, args);
    }


}

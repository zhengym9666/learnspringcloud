package com.zym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.zym")
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeinApp {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeinApp.class,args);
    }

}

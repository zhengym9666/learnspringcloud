package com.zym;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SnowClientApp {

    public static void main(String[] args) {
        SpringApplication.run(SnowClientApp.class,args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("模拟服务雪崩，服务提供者");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello，服务雪崩，my port is "+port;
    }

    @RequestMapping("/other")
    public String other() {
        return "hello，服务雪崩，我是其他服务";
    }


}

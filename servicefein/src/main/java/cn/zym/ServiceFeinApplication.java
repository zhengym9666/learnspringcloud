package cn.zym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

//fein服务消费者，伪http客户端，默认继承了ribbon,解决负载均衡问题
@SpringBootApplication(scanBasePackages = {"cn.zym"})
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix//开启断路器
public class ServiceFeinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceFeinApplication.class,args);
    }
}

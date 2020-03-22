package cn.zym;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//服务提供者，配置文件从配置中心服务器configserver的仓库中获取（在bootstrap中配置可知）
@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }


    //获取git中config-client-dev.yml配置文件中的hello配置
    @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hi")
    public String hi(){
        System.out.println("aaaaa");
        return hello;
    }
}

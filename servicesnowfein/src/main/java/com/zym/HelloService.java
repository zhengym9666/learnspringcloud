package com.zym;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "snow-service-provider")
public interface HelloService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String requestHelloService();

    @RequestMapping(value = "/other",method = RequestMethod.GET)
    public String requestOtherService();

}

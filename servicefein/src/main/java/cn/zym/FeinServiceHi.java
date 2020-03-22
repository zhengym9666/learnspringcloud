package cn.zym;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = FeinServiceHiHystric.class)
public interface FeinServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHiFromOneClient(@RequestParam(value="name") String name);

}

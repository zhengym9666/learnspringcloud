package cn.zym;

import org.springframework.stereotype.Component;

@Component
public class FeinServiceHiHystric implements FeinServiceHi {
    @Override
    public String sayHiFromOneClient(String name) {
        return "hi,"+name+", sorry, error!";
    }
}

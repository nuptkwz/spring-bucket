package com.example.servicefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
 * Date 2020/7/5 12:26
 * Created by kwz
 */
@Component
public class FeignServiceImpl implements IFeignService {

    @Override
    public String sayHelloFromEurekaClientOne(String name) {
        return "sorry " + name;
    }

}

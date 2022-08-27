package com.example.servicefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
 * Date 2020/7/5 12:26
 * Created by kwz
 */
@FeignClient(value = "service-client", fallback = FeignServiceImpl.class)
public interface IFeignService {

    @GetMapping("client/hello")
    String sayHelloFromEurekaClientOne(@RequestParam("name") String name);

}

package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.IHelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * Date 2020/7/5 10:06
 * Created by kwz
 */
@RestController
@RequestMapping("ribbon")
public class RibbonController {

    @Setter(onMethod_ = @Autowired)
    private IHelloService iHelloService;

    /**
     * Description
     * v1版本：ribbon+restTemplate
     * 当service-ribbon通过restTemplate调用service-client的client接口时，
     * 因为用ribbon进行了负载均衡，会轮流的调用service-client：8762和8763 两个端口的hi接口；
     *
     * Param [name]
     * return java.lang.String
     */
    @GetMapping("/hello")
    private String helloRibbon(@RequestParam String name) {
        return iHelloService.helloService(name);
    }


}

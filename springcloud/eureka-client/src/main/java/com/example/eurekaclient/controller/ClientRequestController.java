package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * Date 2020/7/3 21:45
 * Created by kwz
 */
@RestController
@RequestMapping("client")
public class ClientRequestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "kwz")
                                   String name) {

        return "hello " + name + ",my port is:" + port;
    }
}

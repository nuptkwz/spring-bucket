package com.example.springboot.controller;

import com.example.springboot.config.PersonalConfig;
import com.example.springboot.config.UserConfig;
import com.google.common.collect.Lists;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description
 * 相比于spring mvc, spring boot优点在于：
 * 1.不需要做任何的web.xml配置
 * 2.不需要做任何spring mvc的配置; springboot为你做了。
 * 3.不用配置tomcat，springboot内嵌了tomcat
 * Date 2020/7/6 20:26
 * Created by kwz
 */
@RestController
@RequestMapping("hello")
@Slf4j
public class UserController {

    @Value("${personal.hello}")
    private String hello;

    @Value("${personal.uuid}")
    private String personalUuid;

    @Setter(onMethod_ = @Autowired)
    private PersonalConfig personalConfig;

    @Setter(onMethod_ = @Autowired)
    private UserConfig userConfig;

    @GetMapping
    public String index() {
        return "hello spring boot";
    }

    @GetMapping("/config")
    public String getConfig() {
        return hello + " " + personalUuid;
    }

    @GetMapping("/PersonalConfig")
    public List<Object> personalConfig() {
        List<Object> personalList = Lists.newArrayList();
        personalList.add(personalConfig.getAge());
        personalList.add(personalConfig.getName());
        personalList.add(personalConfig.getHello());
        personalList.add(personalConfig.getMax());
        personalList.add(personalConfig.getUuid());
        return personalList;
    }

    @GetMapping("/UserConfig")
    public String getUserConfig() {
        return userConfig.getName() + " " + userConfig.getAge();
    }
}

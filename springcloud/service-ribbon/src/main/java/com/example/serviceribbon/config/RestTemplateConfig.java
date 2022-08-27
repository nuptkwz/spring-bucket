package com.example.serviceribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Description
 * Date 2020/7/5 9:46
 * Created by kwz
 */
@Configuration
public class RestTemplateConfig {


    /**
     * Description
     * 通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
     * Param []
     * return org.springframework.web.client.RestTemplate
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

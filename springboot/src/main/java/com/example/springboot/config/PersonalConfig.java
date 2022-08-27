package com.example.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description
 * Date 2020/7/6 21:26
 * Created by kwz
 */
@ConfigurationProperties(prefix = "personal")
@Component
@Data
public class PersonalConfig {
    private String name;
    private int age;
    private String uuid;
    private String hello;
    private int max;
}

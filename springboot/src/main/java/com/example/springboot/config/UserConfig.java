package com.example.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Description
 * 可以按照配置文件加载
 * Date 2020/7/6 21:44
 * Created by kwz
 */
@Configuration
@PropertySource(value = "classpath:dev.properties")
@ConfigurationProperties(prefix = "")
@Data
public class UserConfig {
    private String name;
    private int age;
}

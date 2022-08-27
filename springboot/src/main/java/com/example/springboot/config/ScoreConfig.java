package com.example.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Description
 * Date 2021/1/22 0:02
 * Created by kwz
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.example")
@PropertySource(value = "classpath:dev.properties")
public class ScoreConfig {
    private String name;
    private String age;
}

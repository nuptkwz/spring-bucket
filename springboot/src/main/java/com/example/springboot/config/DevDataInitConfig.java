package com.example.springboot.config;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Description Profile for class
 * 需要在dev环境下执行的数据初始化
 * Date 2021/1/21 23:21
 * Created by kwz
 */
@Profile("prod")
@Configuration
@Slf4j
public class DevDataInitConfig {

    @Setter(onMethod_ = @Autowired)
    private ScoreConfig scoreConfig;

    @Setter(onMethod_ = @Autowired)
    private DataSourceConfig dataSourceConfig;

    @Bean
    public CommandLineRunner dataInit() {
        //实现了该接口的代码会在 Spring Boot 应用程序启动时自动进行执行
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                String name = scoreConfig.getName();
                log.info(name + "init dev environment params");

                log.info("--------------------------------------->");
                log.info("dataSourceConfig--prod:{}",dataSourceConfig.prodDataSource());
            }
        };
    }
}

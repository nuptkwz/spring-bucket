package com.example.springboot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Description
 * Date 2021/1/21 0:08
 * Created by kwz
 */
@Configuration
@Slf4j
public class DataSourceConfig {

    @Value("${personal.name}")
    private String personalName;

    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        //创建 dev 环境下的 DataSource
        log.info("personalName:{}",personalName);
        return null;
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        //创建 prod 环境下的 DataSource
        log.info("personalName:{}",personalName);
        return null;
    }

    @Bean
    @Profile("test")
    public DataSource testDataSource() {
        //创建 prod 环境下的 DataSource
        log.info("personalName:{}",personalName);
        return null;
    }
}

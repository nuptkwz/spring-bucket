package com.example.springboot.config;

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
public class DataSourceConfig{

    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        //创建 dev 环境下的 DataSource
        return null;
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource(){
        //创建 prod 环境下的 DataSource
        return null;
    }
}

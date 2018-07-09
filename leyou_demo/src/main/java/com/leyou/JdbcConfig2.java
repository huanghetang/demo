package com.leyou;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhoumo
 * @datetime 2018/6/29 17:11
 * @desc
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig2 {


    @Bean
    public DataSource getDataSource(JdbcProperties jdbc){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setDriverClassName(jdbc.getDriverClassName());
        dataSource.setUsername(jdbc.getUsername());
        dataSource.setPassword(jdbc.getPassword());
        return dataSource;
    }

    

}

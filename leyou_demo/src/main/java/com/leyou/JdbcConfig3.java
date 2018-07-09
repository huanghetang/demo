package com.leyou;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhoumo
 * @datetime 2018/6/29 17:11
 * @desc
 */
@Configuration
public class JdbcConfig3 {


    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

    

}

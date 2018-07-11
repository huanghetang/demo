package com.leyou;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author zhoumo
 * @datetime 2018/6/29 17:11
 * @desc spring4原始java配置用法
 */
//@Configuration//spring4提供的注解,用来代替xml
//@PropertySource("classpath:jdbc.properties")//等于在xml中的context:palceholder引入外部资源文件
public class JdbcConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean//定义一个bean组件,bean的类型为方法返回值,方法名为id
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }



}

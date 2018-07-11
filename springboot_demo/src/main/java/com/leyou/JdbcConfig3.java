package com.leyou;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhoumo
 * @datetime 2018/6/29 17:11
 * @desc  springboot更优雅的注入方式,默认自动读取application.properties(优先)/application.yml文件
 *         需要配置的名字和使用的set方法的名字相同
 */
//@Configuration//配置类
public class JdbcConfig3 {


    @Bean//配置组件
    @ConfigurationProperties(prefix = "jdbc")//配置属性
    public DataSource getDataSource(){
        //这里会自动把配置的属性通过set方法注入
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

    

}

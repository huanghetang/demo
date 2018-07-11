package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zhoumo
 * @datetime 2018/6/29 16:50
 * @desc
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.leyou.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

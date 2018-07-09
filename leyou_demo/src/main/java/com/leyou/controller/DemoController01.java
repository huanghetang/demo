package com.leyou.controller;

import com.leyou.JdbcConfig2;
import com.leyou.JdbcConfig3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author zhoumo
 * @datetime 2018/6/29 16:53
 * @desc
 */
//是组合注解 有@Controller和@ResponseBody的功能
@RestController
public class DemoController01 {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcConfig2 jdbcConfig2 ;

    @Autowired
    private JdbcConfig3 jdbcConfig3;

    @GetMapping("hello")
    public String hello(){
        return "springboot,你好";
    }

    @GetMapping("datasource")
    public String datasource(){

        return "hello,你好"+dataSource;
    }

    @GetMapping("d2")
    public String d2(){

        return "hello,你好dfs"+jdbcConfig2;
    }

    @GetMapping("d3")
    public String d3(){

        return "3333333333333"+jdbcConfig3;
    }
}

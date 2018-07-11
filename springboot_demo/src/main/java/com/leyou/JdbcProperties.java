package com.leyou;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhoumo
 * @datetime 2018/6/29 17:47
 * @desc
 */
//申明当前类为属性读取类,不需要@Value注解读取
@ConfigurationProperties(prefix = "jdbc")//springboot提供的注解 配置属性注解 只要属性名和文件中的名字相同即可,支持对象导航注入
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

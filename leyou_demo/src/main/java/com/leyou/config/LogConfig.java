package com.leyou.config;

import com.leyou.interceptor.LogInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zhoumo
 * @datetime 2018/6/29 21:51
 * @desc
 */
@Configuration
public class LogConfig implements WebMvcConfigurer {

    @Bean
    public LogInterceptor getLogInterceptor(){
        return new LogInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.getLogInterceptor()).addPathPatterns("/**");
    }
}

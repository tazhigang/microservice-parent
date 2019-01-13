package com.ittzg.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/13 22:19
 * @Description:
 */
@Configuration
public class FooConfiguration {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("user","password");
    }
}

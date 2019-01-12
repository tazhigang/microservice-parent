package com.ittzg.cloud;

import com.netflix.discovery.DiscoveryClient;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.ArrayList;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/7 22:57
 * @Description:
 */
@SpringBootApplication
public class ConsumerMovieRibbonApplication {
    @LoadBalanced
    @Bean
    public RestTemplate getInstance(){
        return new RestTemplate();
    }
    //除去配置之外 我们可以使用@Bean实现将服务注册到用户认证的eureka上去
    @Bean
    public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs(){
        DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs =
                new DiscoveryClient.DiscoveryClientOptionalArgs();
        List<ClientFilter> additionalFilters = new ArrayList<ClientFilter>();
        additionalFilters.add(new HTTPBasicAuthFilter("admin","admin123"));

        discoveryClientOptionalArgs.setAdditionalFilters(additionalFilters);
        return discoveryClientOptionalArgs;
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieRibbonApplication.class,args);
    }
}

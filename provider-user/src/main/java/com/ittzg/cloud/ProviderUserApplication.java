package com.ittzg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/8 20:04
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient  //是eureka组件
//@EnableDiscoveryClient    //可是其他任意服务发现组件
public class ProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class,args);
    }
}

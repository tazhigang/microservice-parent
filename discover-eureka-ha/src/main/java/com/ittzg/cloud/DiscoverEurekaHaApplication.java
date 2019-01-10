package com.ittzg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/8 20:30
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoverEurekaHaApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoverEurekaHaApplication.class,args);
    }
}

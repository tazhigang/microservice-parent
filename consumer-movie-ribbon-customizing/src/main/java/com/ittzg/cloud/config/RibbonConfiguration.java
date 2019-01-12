package com.ittzg.cloud.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/13 0:37
 * @Description:
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
//        return new RandomRule(); //随机轮询
        return new BestAvailableRule();
    }
}

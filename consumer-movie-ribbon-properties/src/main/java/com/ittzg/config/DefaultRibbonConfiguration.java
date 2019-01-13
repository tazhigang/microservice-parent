package com.ittzg.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: ittzg
 * @CreateDate: 2019/1/13 0:37
 * @Description:
 */
@Configuration
@SuppressWarnings("all")
public class DefaultRibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
//        return new RandomRule(); //随机轮询
        return new BestAvailableRule();
    }
    @Bean
    public IPing ribbinIp(){
        return new PingUrl();
    }
    @Bean
    public ServerList<Server> ribbonServerList(IClientConfig config){
        return new RibbonClientDefaultConfigurationTestConfig.BazServiceList(config);
    }
    @Bean
    public ServerListFilter serverListFilter(){
        return new ServerListSubsetFilter();
    }
}

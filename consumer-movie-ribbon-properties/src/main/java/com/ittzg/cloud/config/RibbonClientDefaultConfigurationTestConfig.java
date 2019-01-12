package com.ittzg.cloud.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ConfigurationBasedServerList;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/13 1:03
 * @Description:
 */
@Configuration
@RibbonClients(defaultConfiguration = DefaultRibbonConfiguration.class)
public class RibbonClientDefaultConfigurationTestConfig {
    public static class BazServiceList extends ConfigurationBasedServerList{
        public BazServiceList(IClientConfig config){
            super.initWithNiwsConfig(config);
        }
    }
}

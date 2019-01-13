package com.ittzg.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ConfigurationBasedServerList;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/13 1:03
 * @Description:
 */
@RibbonClients(defaultConfiguration = DefaultRibbonConfiguration.class)
public class RibbonClientDefaultConfigurationTestConfig {
    public static class BazServiceList extends ConfigurationBasedServerList{
        public BazServiceList(IClientConfig config){
            super.initWithNiwsConfig(config);
        }
    }
}

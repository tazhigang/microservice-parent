package com.ittzg.cloud.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/13 0:39
 * @Description:
 */
@Configuration
@RibbonClient(name = "provider-user",configuration = RibbonConfiguration.class)
public class TestRibbonConfiguration {
}

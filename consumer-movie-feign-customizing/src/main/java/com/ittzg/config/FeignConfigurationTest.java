package com.ittzg.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/13 21:58
 * @Description: 该类是feign的配置类
 *  注意：该类不能写@Configuration注解；如果加了@Configuration注解。那么该类不能放在主程序
 *      上下文@ComponentScan所扫描的包中
 */
public class FeignConfigurationTest {
    @Bean
    public Contract feugnContract(){
        return new feign.Contract.Default();
    }
}

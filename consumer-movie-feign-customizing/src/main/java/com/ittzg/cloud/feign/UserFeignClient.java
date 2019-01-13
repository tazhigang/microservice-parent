package com.ittzg.cloud.feign;

import com.ittzg.cloud.entity.User;
import com.ittzg.config.FeignConfigurationTest;
import com.ittzg.config.FooConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignAutoConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/8 20:46
 * @Description:
 */
@Component
@FeignClient(name = "PROVIDER-USER",configuration = {FeignConfigurationTest.class, FooConfiguration.class})
public interface UserFeignClient {
    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}

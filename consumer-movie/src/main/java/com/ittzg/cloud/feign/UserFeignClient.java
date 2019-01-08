package com.ittzg.cloud.feign;

import com.ittzg.cloud.entity.User;
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
@FeignClient(name = "PROVIDER-USER")
public interface UserFeignClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}

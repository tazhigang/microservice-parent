package com.ittzg.cloud.controller;

import com.ittzg.cloud.repository.entity.User;
import com.ittzg.cloud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/7 23:22
 * @Description:
 */
@RestController
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id, HttpServletRequest request){
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();
        log.info("{}/:{}",remoteHost,remotePort);
        return userService.queryOne(id);
    }
}

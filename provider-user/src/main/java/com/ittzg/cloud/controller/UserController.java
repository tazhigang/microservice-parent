package com.ittzg.cloud.controller;

import com.ittzg.cloud.repository.entity.User;
import com.ittzg.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/7 23:22
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.queryOne(id);
    }
}

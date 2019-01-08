package com.ittzg.cloud.service.impl;

import com.ittzg.cloud.repository.UserRepository;
import com.ittzg.cloud.repository.entity.User;
import com.ittzg.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/7 23:21
 * @Description:
 */
@Service
public class UserServuceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User queryOne(long id) {
        return userRepository.findOne(id);
    }
}

package com.ittzg.cloud.service;

import com.ittzg.cloud.repository.entity.User;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/7 23:20
 * @Description:
 */
public interface UserService {
    User queryOne(long id);
}

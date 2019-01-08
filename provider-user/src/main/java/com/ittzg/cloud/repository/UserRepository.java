package com.ittzg.cloud.repository;

import com.ittzg.cloud.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: ittzg
 * @CreateDate: 2019/1/8 20:05
 * @Description:
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

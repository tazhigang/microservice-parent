package com.ittzg.cloud.controller;
import com.ittzg.cloud.entity.User;
import com.ittzg.cloud.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
  @Autowired
  private UserFeignClient userFeignClient;
  @GetMapping(value = "/user/{id}")
  public User findById(@PathVariable Long id) {
    return userFeignClient.findById(id);
  }
}

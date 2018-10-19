package com.toov5.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toov5.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
  @Autowired
  private UserMapper userMapper;
  
  public int insertUser(String name, Integer age){
	 int result = userMapper.insert(name, age);
      log.info("####################",result);
	  return result;
  }
}
package com.toov5.test01.service01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toov5.test01.mappertest01.UserMapperTest01;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService01 {
  @Autowired
  private UserMapperTest01 userMapperTest01;
  
  
  @Transactional
  public int insertUser(String name, Integer age){
	 int result = userMapperTest01.insert(name, age);
      log.info("####################",result);
	  return result;
  }
}

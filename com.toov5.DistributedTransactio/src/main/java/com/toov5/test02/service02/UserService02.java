package com.toov5.test02.service02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toov5.test01.mappertest01.UserMapperTest01;
import com.toov5.test02.mappertest02.UserMapperTest02;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService02 {
  @Autowired
  private UserMapperTest01 userMapperTest01;
  @Autowired
  private UserMapperTest02 userMapperTest02;
  
  
  @Transactional
  public int insertUser(String name, Integer age){
	 int result = userMapperTest02.insert(name, age);
      log.info("####################",result);
	  return result;
  }
  
  
  @Transactional
  public int test01Andtest02(String name, Integer age){
	    //连接两个数据源
	      int result1 = userMapperTest01.insert(name, age);
		  int result2 = userMapperTest02.insert(name, age);
		  int i = 1/0;
	      int result = result1+result2;
		  return result;
	  }
  
}

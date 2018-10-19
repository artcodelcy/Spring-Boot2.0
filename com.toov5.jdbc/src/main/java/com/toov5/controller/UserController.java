package com.toov5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toov5.service.UserService;

@RestController
public class UserController {
@Autowired
private UserService userService;
@RequestMapping("/insertUser")  

 @Transactional
  public Integer insertUser(String name, Integer age){
	int i= 1/age;
	 return userService.insertUser(name, age);
     
     }
 
}

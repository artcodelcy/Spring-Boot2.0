package com.toov5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toov5.service.UserServiceImpl;

@RestController
public class IndexController{

	@Autowired
	private UserServiceImpl u;
	
	@RequestMapping("/index")
	public String index(String name, Integer age){
		u.createUser(name, age);
		return "ok";
	}
	
}

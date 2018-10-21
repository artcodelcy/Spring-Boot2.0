package com.toov5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toov5.service.UserService;

@RestController //Spring mvc �ṩ�Ĺ�  
public class IndexController {
   @Autowired
   private UserService userService;
	
	
	
	@RequestMapping("/index")
	public String index(){
//		return "successful";
	   return	userService.index();
	}
	
}

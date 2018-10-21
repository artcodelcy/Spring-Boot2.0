package com.toov5.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @Value("${information.name}")
    private String name;
	
    @Value("${information.age.record}")
    private String record;
    
	@RequestMapping("/index")
	public String index(){
		return "ok";
	}
	
	@RequestMapping("/getName")
	public String getInformation(){
		return name;
	}
	
	@RequestMapping("/getRecord")
	public String getRecord(){
		return record;
	}
      
}

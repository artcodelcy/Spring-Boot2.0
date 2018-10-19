package com.toov5.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   
@RequestMapping("hello")	
  public String index(){
	  
	  return "hello world";
  }
	
	public static void main(String[] args){
		SpringApplication.run(HelloController.class, args);
	}
	
}

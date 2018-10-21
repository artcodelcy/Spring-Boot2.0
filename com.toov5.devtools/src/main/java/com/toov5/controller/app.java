package com.toov5.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.toov5")
@SpringBootApplication
public class app {
  public static void main(String[] args){
	  SpringApplication.run(app.class, args);
  }
}

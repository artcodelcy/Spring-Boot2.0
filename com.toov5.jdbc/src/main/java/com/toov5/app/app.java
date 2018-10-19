package com.toov5.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.toov5")
@MapperScan(basePackages="com.toov5.mapper") 
@SpringBootApplication
public class app {
  public static void main(String[] args){
	  SpringApplication.run(app.class, args);
  }
}
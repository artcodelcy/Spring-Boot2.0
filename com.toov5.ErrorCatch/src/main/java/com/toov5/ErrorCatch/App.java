package com.toov5.ErrorCatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages={"com.toov5.error","com.toov5.ErrorCatch"})

@SpringBootApplication(scanBasePackages={"com.toov5.*"})
public class App {
  public static void main(String[] args){
	  SpringApplication.run(App.class, args);
  }	
}
 
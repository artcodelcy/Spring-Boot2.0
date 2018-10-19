package com.toov5.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages={"com.toov5.*"})
@EnableAsync
public class app {
public static void main(String[] args){
	SpringApplication.run(app.class, args);
}
	
	
}

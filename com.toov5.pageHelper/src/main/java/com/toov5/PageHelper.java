package com.toov5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.toov5.*")
@SpringBootApplication
public class PageHelper {

	public static void main(String[] args) {
		SpringApplication.run(PageHelper.class, args);
	}

} 
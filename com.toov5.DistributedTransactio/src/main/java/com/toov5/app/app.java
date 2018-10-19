package com.toov5.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.toov5.configure.DBConfig1;
import com.toov5.configure.DBConfig2;

@SpringBootApplication(scanBasePackages={"com.toov5.*"})
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
//开启读取配置文件，启动时候去读取配置文件
public class app {
   
	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
	
}

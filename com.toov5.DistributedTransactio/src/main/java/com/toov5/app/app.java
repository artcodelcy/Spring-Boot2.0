package com.toov5.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.toov5.configure.DBConfig1;
import com.toov5.configure.DBConfig2;

@SpringBootApplication(scanBasePackages={"com.toov5.*"})
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
//������ȡ�����ļ�������ʱ��ȥ��ȡ�����ļ�
public class app {
   
	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
	
}

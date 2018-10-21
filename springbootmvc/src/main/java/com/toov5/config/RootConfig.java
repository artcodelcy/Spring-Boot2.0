package com.toov5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * 加载非Springmvc 的配置
 * 
 */

@Configuration
@ComponentScan(basePackages = "com.toov5")  //扫整个项目的
public class RootConfig {
    
	
	
}

package com.toov5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
 * spring mvc的配置信息
 * 
 */
@Configuration   //表示配置
@EnableWebMvc   //开启springmvc功能 扫包 视图转换 拦截器
@ComponentScan("com.toov5.controller")  //扫controller包 类似与传统的配置中 开启扫包模式那段xml配置
public class WebConfig extends WebMvcConfigurerAdapter {
  
	//需要配置视图器
	// 创建SpringMVC视图解析器
		@Bean
		public ViewResolver viewResolver() {
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
	            //可以在JSP页面中通过${}访问beans
			viewResolver.setExposeContextBeansAsAttributes(true);
			return viewResolver;
		}

	
	
}

package com.toov5.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * 加载springmvc--dispatcherservlet
 * 下面的这个接口 初始化dispatcherservlet
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// 加载根容器 加载跟配置信息 spring核心 
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { RootConfig.class };
	}

	// 加载SpringMVC容器 springmvc 加载配置信息
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { WebConfig.class };  //相当于一个数组里面放了一个Class
	}

	// SpringMVCDispatcherServlet 拦截的请求 /   拦截所有请求
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}

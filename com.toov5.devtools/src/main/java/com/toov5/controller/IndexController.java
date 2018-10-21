package com.toov5.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class IndexController {
	@Value("${name}")
	private String name;

	@RequestMapping("/index")
	public String index() {
		String result = "修改啊来啊";
		log.info("result:{}", result);
		return result + name;
	}

}
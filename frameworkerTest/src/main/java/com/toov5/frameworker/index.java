package com.toov5.frameworker;



import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class index {
    @RequestMapping("/index")
	public String show(Map<String, Object> map){
	    map.put("name", "toov5");
	    map.put("age","20");
	    map.put("sex","0");
		return "index";
	}
	
	
	
}
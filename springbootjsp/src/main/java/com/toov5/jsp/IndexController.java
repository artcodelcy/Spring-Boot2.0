package com.toov5.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
   
    private String name;
    
	@RequestMapping("/jsp")
	public String index(){
		return "index";
	}

	
}

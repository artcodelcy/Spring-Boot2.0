package com.joe.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	@RequestMapping("/getMember")
  public Map<String,Object> getMember(){
	  Map<String, Object> hashMap = new HashMap<String, Object>();
	  hashMap.put("errCode", 200);
	  hashMap.put("errsoMsg", "╪ссм");
	  return hashMap;
  }
}

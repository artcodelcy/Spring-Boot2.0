package com.toov5.ErrorCatch;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RestController //�Ժ󾭳���΢�����쳣����Ҫ�����õ����ע��
@Slf4j
public class ErrorCatch {
    
    @RequestMapping("/getUser")
	public String getUser(int i ){
        int j = 1/i;	
        log.info("�ɹ���");
    	return "����"+j;
	}
    @RequestMapping("/getMember")
    public String getMember(String name, Integer age){
//    	log.info("name"+name+",age"+age );//��������������Ҫд���ô�� ������aopȥͳһ����
    	return "okokok";
    }
    
    
}
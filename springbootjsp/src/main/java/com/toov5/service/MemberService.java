package com.toov5.service;


import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberService {
    //添加用户时候发送邮件
//	@Async
//	public String addMemberAndEmail(){
//		log.info("2");  
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		log.info("3");
//		return "toov5";
//
//	}

	public String addMemberAndEmail(){
		
	   new Thread(new Runnable() {
		
		public void run() {
		
			log.info("2");  
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			log.info("3");
//			return "toov5";  //这里应该用从callable  有返回值 或者future模式
				
		}
	}).start();
	
	   return "toov5";  //将就下 返回值由于是用的runnable写的嘛 先这样迁就下
		
	}
	
	

		
}

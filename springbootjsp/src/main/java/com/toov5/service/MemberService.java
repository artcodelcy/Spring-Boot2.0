package com.toov5.service;


import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberService {
    //����û�ʱ�����ʼ�
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
//			return "toov5";  //����Ӧ���ô�callable  �з���ֵ ����futureģʽ
				
		}
	}).start();
	
	   return "toov5";  //������ ����ֵ�������õ�runnableд���� ������Ǩ����
		
	}
	
	

		
}

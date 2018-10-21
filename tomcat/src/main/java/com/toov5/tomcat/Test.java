package com.toov5.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.startup.Tomcat.FixContextListener;

import com.toov5.servlet.IndexServlet;

//ʹ��Java����Tomcat����
//tomcat �ײ�ִ�г���  ����ִ��servlet
//Springmvc�ײ�ʹ��servlet

public class Test {
       private static int PORT = 8080; //�˿�
       private static String CONTEX_PATH = "/toov5";  //��Ŀ��������
       private static String SERVLET_NAME="IndexServlet";
	   public static void main(String[] args) {
		Tomcat tomcatServer =  new Tomcat();
		tomcatServer.setPort(PORT);  //ָ���˿ں�
		//�Ƿ������Զ�����
		tomcatServer.getHost().setAutoDeploy(false);
		//����������,�õ������ĺ�Ϳ��������������ʵ�ַ��
		StandardContext standardContext = new StandardContext();
		standardContext.setPath(CONTEX_PATH); 
		//����������
		standardContext.addLifecycleListener(new FixContextListener());
		standardContext.addLifecycleListener(new FixContextListener());
		// tomcat��������standardContext ��������context
		tomcatServer.getHost().addChild(standardContext);
		// ����servlet   servlet�����ֽ�IndexServlet   
		tomcatServer.addServlet(CONTEX_PATH, SERVLET_NAME, new IndexServlet());
		// ����servleturlӳ��
		standardContext.addServletMappingDecoded("/index", SERVLET_NAME);
		try {
			tomcatServer.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
		System.out.println("tomcat�����������ɹ���");
		//��Ҫ�첽��������
			tomcatServer.getServer().await();	
	}  
	 
	   
	  

}
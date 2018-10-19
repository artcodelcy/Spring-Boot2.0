package appServer8000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class appServer8000 {
  public static void main(String[] args){
	  SpringApplication.run(appServer8000.class, args);
  }
}

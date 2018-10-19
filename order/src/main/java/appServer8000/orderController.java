package appServer8000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class orderController {
  @Autowired
  private RestTemplate restTemplate;
  
  @RequestMapping("/getorder")
  public String getOrder(){
	  String memberUrl = "http://app-itmayiedu-member/getMember";
	  String result = restTemplate.getForObject(memberUrl, String.class);
	  System.out.println("会员服务调用订单服务,result:" + result);
	 return result;
	  
	  
  }
}

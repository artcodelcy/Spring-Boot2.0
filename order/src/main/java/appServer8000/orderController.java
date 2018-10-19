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
	  System.out.println("��Ա������ö�������,result:" + result);
	 return result;
	  
	  
  }
}

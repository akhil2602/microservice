package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;


@RestController
@RequestMapping("client")
public class ClientController {

	protected RestTemplate restTemplate;
	@Autowired
	private EurekaClient discoveryClient;

	public String serviceUrl() {
	    InstanceInfo instance = 
	    		discoveryClient.getNextServerFromEureka("COMAPNY-SERVICE", false);
	  
	    return instance.getHomePageUrl();
	}
	
	@GetMapping("retrievecompany")
	public ResponseEntity<Company> retrieveEmployee(){
		restTemplate=new RestTemplate();
		//Based on discovery from Eureka Server
		Company company=restTemplate.
				getForObject(serviceUrl()+"/company/allcompanies", Company.class);
	    //Hard coded url which may change
		//Employee employee=restTemplate.getForObject("http://localhost:8088/employee/allemployees", Employee.class);
		ResponseEntity<Company> response=new ResponseEntity<Company>(company,
				HttpStatus.OK);
		return response;
	

}
	
	
	
	
}

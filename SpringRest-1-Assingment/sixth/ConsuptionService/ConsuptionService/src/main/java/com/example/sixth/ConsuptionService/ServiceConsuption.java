package com.example.sixth.ConsuptionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceConsuption {
	
	private RestTemplate restTemplate;

	@Autowired
	public ServiceConsuption(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public Integer add(Numbers n1)
	{

		HttpEntity<Numbers> entity =new HttpEntity<>(n1);
		return restTemplate.exchange("http://localhost:8080/add",HttpMethod.POST,entity,Integer.class).getBody(); 
		
	}

	public int sqrt(int num) {
		HttpEntity<Integer> entity =new HttpEntity<>(num);
		return restTemplate.exchange("http://localhost:8080/sqrt",HttpMethod.POST,entity,Integer.class).getBody(); 
	}

	public int multiply(Numbers num) {
		HttpEntity<Numbers> entity =new HttpEntity<>(num);
		return restTemplate.exchange("http://localhost:8080/multiply",HttpMethod.POST,entity,Integer.class).getBody(); 
	}

	public int devide(Numbers num) {
		HttpEntity<Numbers> entity =new HttpEntity<>(num);
		return restTemplate.exchange("http://localhost:8080/devide",HttpMethod.POST,entity,Integer.class).getBody(); 
	}

	public int subtract(Numbers num) {
		HttpEntity<Numbers> entity =new HttpEntity<>(num);
		return restTemplate.exchange("http://localhost:8080/subtract",HttpMethod.POST,entity,Integer.class).getBody(); 
	}
	

}

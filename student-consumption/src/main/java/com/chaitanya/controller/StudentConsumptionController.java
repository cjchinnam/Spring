package com.chaitanya.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class StudentConsumptionController {
	
	/*@Autowired
	private DiscoveryClient discoveryClient;*/
	
	public void getStudent() throws RestClientException, IOException{
	
		/*List<ServiceInstance> instances=discoveryClient.getInstances("employee-producer");
		
		ServiceInstance serviceInstance=instances.get(0);
		
		String baseUrl=serviceInstance.getUri().toString();
		
		
		baseUrl=baseUrl+"/student";*/
		String baseUrl = "http:localhost:8080/employee";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try {
			response= restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		}catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println(response.getBody());
	}

	private static HttpEntity<?> getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}

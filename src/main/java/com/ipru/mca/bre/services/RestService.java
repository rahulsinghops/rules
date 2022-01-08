package com.ipru.mca.bre.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;	

@Service
public class RestService {
    @Autowired
	RestTemplate resttemp;
	private String url = "http://localhost:9090/services";

	public String getservice()
 {
	 HttpHeaders header = new HttpHeaders();
	 header.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
	 
		
		  HttpEntity<String> entity = 	new HttpEntity<>(header);
		  ResponseEntity<String> response= resttemp.exchange(url, org.springframework.http.HttpMethod.GET, entity, String.class);
		 
	 return response.getBody();
 }
}

package com.example.useriput.service;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.useriput.entity.User;
@Service
public class InputService {

	public void validate(User user) {
		
		
	}

	public void register(User user) {
		final String uri = "http://localhost:5002/register";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
//	    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
	    ResponseEntity result = restTemplate.postForObject(uri, user, ResponseEntity.class);
	    System.out.println(result);
	}

}

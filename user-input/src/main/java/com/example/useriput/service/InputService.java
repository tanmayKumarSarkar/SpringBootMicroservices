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

	final String uri = "http://localhost:5002";
	
	public User validate(User user) {
		String url = uri+"/validate";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    User usr = restTemplate.postForObject(url, user, User.class);
	    System.out.println(usr);
	    return usr;
	}

	public User register(User user) {
		String url = uri+"/register";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    User usr = restTemplate.postForObject(url, user, User.class);
	    System.out.println(usr);
	    return usr;
	}

}

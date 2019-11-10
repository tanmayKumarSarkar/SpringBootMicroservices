package com.example.usermatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermatch.entity.User;
import com.example.usermatch.repository.UserRepository;

@RestController
public class InputController {

	@Autowired
	UserRepository userRepo;
	
	@RequestMapping(value="/validate", method = RequestMethod.POST)
	public User validate(@RequestBody User user) {
		System.out.println(user);
		return userRepo.findOneByUserIdAndPassword(user.getUserId(), user.getPassword());
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public User register(@RequestBody User user) {
		System.out.println(user);
		
//		System.out.println(new ResponseEntity(HttpStatus.CREATED));
		return userRepo.save(user);
	}
}

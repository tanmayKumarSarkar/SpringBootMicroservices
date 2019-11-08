package com.example.usermatch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.usermatch.entity.User;

@Controller
public class InputController {

	@RequestMapping(value="/validate", method = RequestMethod.POST)
	public String validate() {
		return "";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity register(@RequestBody User user) {
		System.out.println(user);
		System.out.println(new ResponseEntity(HttpStatus.CREATED));
		return new ResponseEntity(HttpStatus.CREATED);
	}
}

package com.example.useriput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.useriput.entity.User;
import com.example.useriput.service.InputService;

@Controller
public class InputController {
	
	@Autowired
	InputService inputService;
	
    @RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginSubmit(ModelMap model, @RequestParam String userid, @RequestParam String password) {
		System.out.println(userid + " : " + password);
		User user = new User();
		user.setUserId(userid);
		user.setPassword(password);
		inputService.validate(user);
		return "login";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerSubmit(ModelMap model, @RequestParam String userid, @RequestParam String password) {
		User user = new User();
		user.setUserId(userid);
		user.setPassword(password);
		inputService.register(user);
		return "register";
	}
}

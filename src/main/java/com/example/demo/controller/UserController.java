package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class UserController {
	
	@Autowired
	private UserServiceImpl userimpl;
	
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		userimpl.saveOrUpdate(user);
		return user;
	}
	
	@GetMapping("/list")
	public List<User> list(){
		return userimpl.getAllEmployee();
	}
	
	

}

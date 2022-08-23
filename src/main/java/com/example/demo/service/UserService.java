package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
	
	public List<User> getAllEmployee();
	
	public User getByid(Integer id);
	
	public void saveOrUpdate(User user);
	
	public void deleteUser(Integer id);
	

}

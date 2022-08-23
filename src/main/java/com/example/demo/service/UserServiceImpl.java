package com.example.demo.service;

import java.util.List;



import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public List<User> getAllEmployee() {
		// TODO Auto-generated method stub
		return (List<User>)repo.findAll();
	}

	@Override
	public User getByid(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		repo.save(user);

	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

}

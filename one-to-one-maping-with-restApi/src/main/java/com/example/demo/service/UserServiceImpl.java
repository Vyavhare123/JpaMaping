package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
    
	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}


	@Override
	public User getAllUserById(long id) {
		
		return userRepository.findById(id).get();
	}


	public User updateUserById(User user,long id) {
	User user1=userRepository.findById(id).get();
	user1.setName(user.getName());
	user1.setEmail(user.getEmail());
	user1.setUserProfile(user.getUserProfile());
	return userRepository.save(user1);
		
		
	}


	@Override
	public List<User> getUserByDevision(String name) {
	
		return userRepository.getUserByDevision(name);
	}

	





	





	

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	


	User saveUser(User user);
	
	List<User>getAllUser();
	
	User getAllUserById(long id);
	
	User updateUserById(User user, long id);
	

	public List<User>getUserByDevision(String name);

}

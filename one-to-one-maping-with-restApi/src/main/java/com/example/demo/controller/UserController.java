package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/User")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
		
	}
	
     @GetMapping("/getAll")
     public List<User> getAllUser1(){
		return userService.getAllUser();
    	 
     }
     
     @GetMapping("/getAll/{id}")
     public User getUserById(@PathVariable("id") long id){
		return userService.getAllUserById(id);
    	 
     }
     
    @PutMapping("/updateUser/{id}")
     public User updateUserById(@RequestBody User user,@PathVariable("id") long id){
		 return userService.updateUserById(user, id);
    	 
     }
    
    @GetMapping("/getbyName")
    public List<User> getUserById(@RequestParam String name){
		return  userService.getUserByDevision(name);
   	 
    }
}

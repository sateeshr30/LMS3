package com.neosoft.libmsuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.libmsuser.model.User;
import com.neosoft.libmsuser.repository.UserRepository;
import com.neosoft.libmsuser.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepo;
	
	@PostMapping("/add/users/{phoneno}")
	public User addUsers(@RequestBody User user){	
		 return userService.addUsers(user);
	}
	
	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PutMapping("/update/users/{id}")
	public User updateInfo(@RequestBody User user , @PathVariable Long id ) {
		return userService.update(user);
	
	}
	
	@GetMapping("/user/login/{email}")
	public User loginVerfification(@PathVariable String email) {
		User user1 = userRepo.findByEmail(email);
		return user1;
	}
	

}

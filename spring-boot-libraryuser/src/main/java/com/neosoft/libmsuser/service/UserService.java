package com.neosoft.libmsuser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.libmsuser.model.User;
import com.neosoft.libmsuser.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User addUsers(User user) {
		return userRepo.save(user);
	}
	
	public void deleteUsersById(Long id) {
		userRepo.deleteById(id);
		
	}
	
public Optional<User> getUsersById(Long id) {
		
		return userRepo.findById(id);
	}
	
public User update(User user) {
	
	return userRepo.save(user);
}

public List<User> getUsersByEmail(String email) {
	
	return (List<User>) userRepo.findByEmail(email);
}
	
	
	
	
	
	
	
	
}

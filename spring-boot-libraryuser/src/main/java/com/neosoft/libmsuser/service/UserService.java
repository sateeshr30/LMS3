package com.neosoft.libmsuser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.neosoft.libmsuser.VO.Book;
import com.neosoft.libmsuser.VO.ResponseTemplateVO;
import com.neosoft.libmsuser.model.User;
import com.neosoft.libmsuser.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User addUsers(User user) {
		log.info("Inside addUsers method of UserService");
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

public ResponseTemplateVO getUserWithBook(Long userId) {
	
	ResponseTemplateVO vo = new ResponseTemplateVO();
	User user = userRepo.findByUserId(userId);
	
	Book book = 
			restTemplate.getForObject("http://localhost:9002/book/" + user.getBookId(), Book.class);
	
	
	vo.setUser(user);
	vo.setBook(book);
	
	return vo;
			
	
}
	
	
	
	
	
	
	
	
}

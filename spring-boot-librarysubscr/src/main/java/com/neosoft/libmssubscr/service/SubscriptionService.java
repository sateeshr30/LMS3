package com.neosoft.libmssubscr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.libmssubscr.model.Subscription;
import com.neosoft.libmssubscr.repository.SubscriptionRepo;

@Service
public class SubscriptionService {
	
	@Autowired
	SubscriptionRepo subscriptionRepo;
	
	public Subscription addSubscriptions(Subscription subscription) {
	
			 return subscriptionRepo.save(subscription);
		
	}
	
	public List<Subscription> getAllSubscriptions(){
		return subscriptionRepo.findAll();
	}
	
	
	public Optional<Subscription> getBySubscripctionId(Long subscriptionId){
		return subscriptionRepo.findById(subscriptionId);
	}
	
	
	
	
	
	
	
	
	
}

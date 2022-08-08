package com.neosoft.libmssubscr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.libmssubscr.model.Subscription;
import com.neosoft.libmssubscr.repository.SubscriptionRepo;
import com.neosoft.libmssubscr.service.SubscriptionService;


@RestController
public class SubscriptionController {
	
	@Autowired
	private SubscriptionService subscriptionService;
	
	@Autowired
	private SubscriptionRepo subscriptionRepo;
	
	
	@PostMapping("/add/subscription")
	public Subscription addSubscriptions(@RequestBody Subscription subscription){	
		 return subscriptionService.addSubscriptions(subscription);
	}
	
	
	@GetMapping("/subscriptions")
	public List<Subscription> getAllSubscriptions(){
		return subscriptionService.getAllSubscriptions();
	}
	
	@GetMapping("/getSubscription/{subscriptionId}")
	public Optional<Subscription> getSubscriptionById(@PathVariable Long subscriptionId){
		return subscriptionService.getBySubscripctionId(subscriptionId);
	}

}

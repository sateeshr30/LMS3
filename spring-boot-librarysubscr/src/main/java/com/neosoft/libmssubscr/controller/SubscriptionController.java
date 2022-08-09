package com.neosoft.libmssubscr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.libmssubscr.model.Subscription;
import com.neosoft.libmssubscr.repository.SubscriptionRepo;
import com.neosoft.libmssubscr.service.SubscriptionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/subscription")
public class SubscriptionController {
	
	@Autowired
	private SubscriptionService subscriptionService;
	
	@Autowired
	private SubscriptionRepo subscriptionRepo;
	
	
	@PostMapping("/add")
	public Subscription addSubscriptions(@RequestBody Subscription subscription){	
		log.info("Inside addSubscriptions method of SubscriptionController");
		 return subscriptionService.addSubscriptions(subscription);
	}
	
	
	@GetMapping("/allsubscriptions")
	public List<Subscription> getAllSubscriptions(){
		return subscriptionService.getAllSubscriptions();
	}
	
	@GetMapping("/getSubscription/{subscriptionId}")
	public Optional<Subscription> getSubscriptionById(@PathVariable Long subscriptionId){
		return subscriptionService.getBySubscripctionId(subscriptionId);
	}

}

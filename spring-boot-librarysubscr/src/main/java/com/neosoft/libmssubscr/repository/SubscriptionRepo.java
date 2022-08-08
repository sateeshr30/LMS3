package com.neosoft.libmssubscr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.libmssubscr.model.Subscription;

public interface SubscriptionRepo extends JpaRepository<Subscription, Long>{

}

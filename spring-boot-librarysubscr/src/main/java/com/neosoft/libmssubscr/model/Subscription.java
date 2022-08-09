package com.neosoft.libmssubscr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "subscriptions")
public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subscription_id")
	private Long subscriptionId;
	
	@Column(name = "issued_on")
	private Date issueOn;
	
	@Column(name = "due_date")
	private Date dueDate;
	
	@Column(name = "returned_on")
	private Date returnedOn;
	
	
	

	
}

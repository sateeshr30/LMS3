package com.neosoft.libmsuser.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "User")
@Builder
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="EmailID")
	private String email;
	
	@NotNull
	@Column(name="password")
	private String password ;
	
	
	@NotNull
	@Column(name="phone_number",unique = true)
	private long phoneno;
	
	@Column(name="book_id")
	private Long bookId;
	
	@Column(name="subscription_id")
	private Long subscriptionId;
	

}

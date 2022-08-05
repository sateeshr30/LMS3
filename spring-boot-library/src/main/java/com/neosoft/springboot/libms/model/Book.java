package com.neosoft.springboot.libms.model;

import javax.persistence.*;


import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Book {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Long BookId;
	
	@Column(name = "book_name")
	private String BookName;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "edition")
	private Long edition;
	

	@Column(name = "NoOfBooks")
	private Long NoOfBooks;
	



}

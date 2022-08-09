package com.neosoft.libmsuser.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	private Long BookId;
	private String BookName;
	private String author;
	private Long edition;
	private Long NoOfBooks;
	

}

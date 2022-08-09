package com.neosoft.libmsuser.VO;

import com.neosoft.libmsuser.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private User user;
	
	private Book book;

}

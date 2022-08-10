package com.neosoft.springboot.libms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.neosoft.springboot.libms.model.Book;
import com.neosoft.springboot.libms.service.BookService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/add")
	public Book addBook(@RequestBody Book book) {
		log.info("Inside addBook method of BookController");
		return bookService.addBook(book);
	}
	
	
	@DeleteMapping("/delete/book/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
	}
	
	
	@GetMapping("/allbooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	


	
	@GetMapping("/bookbyid/{id}")
	public Optional<Book> getBookById(@PathVariable long id){
		return bookService.findBookById(id);
	
	}
	
	
	@PutMapping("/book/update/{id}")
	public void updateBook(@PathVariable Long id, @RequestBody Book book) {
		bookService.updateBook(id, book);
	}
	

	
	
	
	

}

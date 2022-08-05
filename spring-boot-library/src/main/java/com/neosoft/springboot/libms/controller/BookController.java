package com.neosoft.springboot.libms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.springboot.libms.model.Book;
import com.neosoft.springboot.libms.service.BookService;

@CrossOrigin(origins = "*")
@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/add/book")
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	
	@DeleteMapping("/delete/book/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
	}
	
	
	@GetMapping("books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	

	
	
	@PutMapping("/book/update/{id}")
	public void updateBook(@PathVariable Long id, @RequestBody Book book) {
		bookService.updateBook(id, book);
	}
	

	
	
	
	

}
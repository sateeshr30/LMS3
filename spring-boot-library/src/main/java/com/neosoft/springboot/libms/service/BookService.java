package com.neosoft.springboot.libms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.springboot.libms.model.Book;
import com.neosoft.springboot.libms.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BookService {
	
@Autowired BookRepository bookRepository;
	

	
	public Book addBook(Book book) {
		log.info("Inside addBook method of BookService");
		return	bookRepository.save(book);
	}
	
	public Optional<Book> deleteBook(Long id) {
		bookRepository.deleteById(id);
		return null;
	}
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	public Optional<Book> findBookById(Long bookId){
		return bookRepository.findById(bookId);
		
	}
	
	
	
	public void updateBook(Long id,Book book) {
		Book b = bookRepository.getById(id);
		b.setAuthor(book.getAuthor());
		b.setBookName(book.getBookName());
		b.setEdition(book.getEdition());
		b.setNoOfBooks(book.getNoOfBooks());
		
		bookRepository.save(book);
	}
	
	
}

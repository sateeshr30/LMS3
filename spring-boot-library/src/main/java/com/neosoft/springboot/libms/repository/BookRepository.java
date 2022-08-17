package com.neosoft.springboot.libms.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neosoft.springboot.libms.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	


public Optional<Book> findById(Long id);
	
@Query(value = "UPDATE BOOK SET noofbooks = ?1 WHERE id = ?2", nativeQuery=true)
@Modifying
@Transactional
Book updateNoOfBooks(Long noofbooks, Long id);
	

}

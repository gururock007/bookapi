package com.gurushik.bookapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gurushik.bookapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> { 
    List<Book> findByAuthorContainingIgnoreCase(String author);
    List<Book> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author); 
}

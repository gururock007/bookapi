package com.gurushik.bookapi.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gurushik.bookapi.exception.BookNotFoundException;
import com.gurushik.bookapi.model.Book;
import com.gurushik.bookapi.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository){
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookById(Long id) {
        return repository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    public Book createBook(Book book) {
        return repository.save(book);
    }

    public Book updateBook(Long id, Book updateBook){
        Book existing = getBookById(id);
        existing.setTitle(updateBook.getTitle());
        existing.setIsbn(updateBook.getIsbn());
        existing.setAuthor(updateBook.getAuthor());
        return repository.save(existing);
    }

    public void deleteBook(Long id){
        Book book = repository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
        repository.delete(book);
    }

    public List<Book> searchByAuthor(String author) {
        return repository.findByAuthorContainingIgnoreCase(author);
    }

    public List<Book> searchByAuthororTitle(String title, String author) {
        return repository.findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(title, author);
    }

    public Page<Book> getBookByPaged(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return repository.findAll(pageable);
    } 

}

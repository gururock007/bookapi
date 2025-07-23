package com.gurushik.bookapi.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gurushik.bookapi.model.Book;
import com.gurushik.bookapi.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService service;

    public BookController(BookService service){
        this.service = service;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return service.getBookById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return service.createBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return service.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }

    @GetMapping("/searchByAuthor")
    public List<Book> searchByAuthor(@RequestParam String author){
        return service.searchByAuthor(author);
    }

    @GetMapping("/search")
    public List<Book> search(@RequestParam String author, String title){
        return service.searchByAuthororTitle(title, author);
    }

    @GetMapping("/paged")
    public Page<Book> getBookByPaged(
        @RequestParam(defaultValue = "0")int page,
        @RequestParam(defaultValue = "5")int size,
        @RequestParam(defaultValue = "title")String sortBy){
            return service.getBookByPaged(page, size, sortBy);
        }
}

package com.gurushik.bookapi.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id){
        super("No book found with id " + id);
    }
}

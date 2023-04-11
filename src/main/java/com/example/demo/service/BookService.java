package com.example.demo.service;

import com.example.demo.model.BookModel;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public BookModel creatBook(BookModel bookModel){
        return  bookRepository.save(bookModel);
    }
    public Optional<BookModel> getAllBook(String id){
        Optional <BookModel> book= bookRepository.findById(id);
        return Optional.of(book.get());
    }

    public void deleteBookById(String id){
        bookRepository.deleteById(id);


    }



}
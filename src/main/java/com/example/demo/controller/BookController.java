package com.example.demo.controller;

import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController{

    @Autowired
    BookService bookService;

    @PostMapping("/postBook")
    public BookModel bookCreate(@RequestBody BookModel bookModel){
        return bookService.creatBook(bookModel);

    }



    @GetMapping("/getBookById/{id}")
    public Optional<BookModel> getAllBook(@PathVariable String id){

        return bookService.getAllBook(id);
    }
    @DeleteMapping("/deleteBook/{id}")
    public String deletedBook(@PathVariable String id){
        bookService.deleteBookById(id);
        return "success";
    }


}
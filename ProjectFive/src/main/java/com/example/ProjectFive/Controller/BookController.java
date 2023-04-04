package com.example.ProjectFive.Controller;

import com.example.ProjectFive.Model.BookModel;
import com.example.ProjectFive.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/createbook")
    public ResponseEntity<BookModel> bookCretae(@RequestBody BookModel bookModel){
        bookService.create(bookModel);
        return  new ResponseEntity<>(bookModel, HttpStatus.ACCEPTED);

    }

    @GetMapping("/getBook")
    public List<BookModel> getAllBook(){

     List <BookModel> list=   bookService.getBook();

        return  list;
//        return bookService.getBook();

    }
    @PutMapping("/updateBook/{id}")
    public BookModel update(@PathVariable String id,@RequestBody BookModel bookModel){
        return  bookService.bookUpdate(id,bookModel);


    }
    @DeleteMapping("/delete/{id}")
    public String DeleteBookById(@PathVariable String id){
         bookService.deleteBook(id);
        return "book success fully deleted";
    }

}

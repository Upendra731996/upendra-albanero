package com.example.ProjectFive.Controller;

import com.example.ProjectFive.Model.BookModel;
import com.example.ProjectFive.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/createbook")
    public String bookCretae(@RequestBody BookModel bookModel){
        return bookService.Create(bookModel);

    }

    @GetMapping("/getBook")
    public List<BookModel> getAllBook(){
        return bookService.getBook();
    }
    @PutMapping("/updateBook/{BookId}")
    public String update(@PathVariable int BookId,@RequestBody BookModel bookModel){
        bookService.bookUpdate(BookId,bookModel);
        return "book success fully aupdated";

    }
    @DeleteMapping("/delete/{id}")
    public String DeleteBookById(@PathVariable String id){
         bookService.DeleteBook(id);
        return "book success fully deleted";
    }

}

package com.example.ProjectFive;

import com.example.ProjectFive.Model.BookModel;
import com.example.ProjectFive.Service.BookService;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.junit.jupiter.api.Assertions;


public class ApiTest {
    @Autowired
    private BookService bookService;

    @Test
    public void unitTestforPost() {
// User user = new User("123","sanvu08","Sanvu Sarvesh",22,
        // 		"sarvesh@gmail.com","albanero","India");
        BookModel bookModel = new BookModel();

        bookModel.setBookId(22);
        bookModel.setBookBody("this is math book");
        bookModel.setBookAuthor("upendra");
        bookModel.setBookTile("M3");
        bookModel.setId("789456123");
        bookModel.setBookName("math");


        Assertions.assertEquals(22,bookModel.getBookId());
        Assertions.assertEquals("this is math book",bookModel.getBookBody());
        Assertions.assertEquals("upendra",bookModel.getBookAuthor());
        Assertions.assertEquals("M3",bookModel.getBookTile());
        Assertions.assertEquals("789456123",bookModel.getId());
        Assertions.assertEquals("math",bookModel.getBookName());


    }
    //=========================================
    @Test
    public void testUpdateUser(){

        BookModel bookModel = new BookModel();

        bookModel.setBookId(22);
        bookModel.setBookBody("this is math book");
        bookModel.setBookAuthor("upendra");


        Assertions.assertEquals(22,bookModel.getBookId());
        Assertions.assertEquals("this is math book",bookModel.getBookBody());
        Assertions.assertEquals("upendra",bookModel.getBookAuthor());

    }
    //===========================================
    @Test
    public void testDEleteAPI(){
        try {


            BookModel bookModel = new BookModel();

            bookModel.setBookId(22);
            bookModel.setBookBody("this is math book");
            bookModel.setBookAuthor("upendra");
            bookModel.setBookTile("M3");
            bookModel.setId("789456123");
            bookModel.setBookName("math");


            bookService.create(bookModel);
            ;
            bookService.deleteBook(bookModel.getId());
            Assertions.assertEquals(null, bookService.deleteBook("789456123"));
        }catch (Exception exception){
            System.out.println(exception.getMessage());}
    }

    //============================================


}








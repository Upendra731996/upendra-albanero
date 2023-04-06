package com.example.ProjectFive;

import com.example.ProjectFive.Model.BookModel;
import com.example.ProjectFive.Repository.BookRepositroy;
import com.example.ProjectFive.Service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.ConditionalOperators.Cond.when;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {
    @Autowired
    private BookService bookService;

// BookModel whenMetho(){
//    return when(bookRepositroy.save(bookModel)).thenReturn(bookModel);
//}



    @Mock
    private BookRepositroy bookRepositroy;
//     String bookName, String bookBody,String bookAuthor,
//                      String bookTile,String id, int bookId
    private BookModel bookModel=new BookModel("math","mathematic","upendra","M","642d44eeb0e639446bbba8df",101);
private BookModel bookModel1= new BookModel("physics","calculation","rohan","PH","642d44eeb0e639446bbba8df",103);
//
    @Test
    public void getapi(){

    assertTrue(bookService.getBook().size()>0);

//
    }


    @Test
    public void postapi(){
        when(bookRepositroy.save(bookModel)).thenReturn(bookModel);
        assertEquals(bookService.create(bookModel),bookModel);
//Ivalid test cases


    }


    @Test
    public void update(){
        when(bookRepositroy.save(bookModel)).thenReturn(bookModel);
        assertNotEquals(bookService.bookUpdate("642d44eeb0e639446bbba8df",bookModel),bookModel1);
    }



    @Test
    public void deleteApi(){

        assertEquals(bookService.deleteBook("642d44eeb0e639446bbba8df"),null);
    }


}
//package com.example.ProjectFive;
//
//import com.example.ProjectFive.Model.BookModel;
//import com.example.ProjectFive.Repository.BookRepositroy;
//
//import com.example.ProjectFive.Service.BookService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.when;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class FirstTest {
//    @InjectMocks
//    BookService bookService;
//
//    @Mock
//    BookRepositroy bookRepositroy;
//    @Test
//    void forgetapi()
//    {
//        List<BookModel> list = new ArrayList<BookModel>();
//        list.add(new BookModel(1,"upendra"));
//        when(bookRepositroy.findAll()).thenReturn(list);
////        System.out.println(bookService.getBook());
//        assertEquals(list,bookService.getBook());
//    }
//}
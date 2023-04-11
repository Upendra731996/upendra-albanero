package com.example.demo.controller;

import com.example.demo.model.AuthMosel;
import com.example.demo.model.BookModel;
import com.example.demo.server.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@RestController
public class AuthController {

    //===================================

    private WebClient webClient = WebClient.create("Http://localhost:8081");
    BookModel bookModel=new BookModel("10","M3","upendra","this is mathematic book");
    //================================
    @Autowired
    AuthService authService;

    @PostMapping("/create")
    public AuthMosel postCreate(@RequestBody AuthMosel authMosel){
        //===========
        BookModel book = webClient
                .post()
                .uri("/postBook")
                .syncBody(bookModel)
                .retrieve()
                .bodyToMono(BookModel.class)
                .block();
        //==========
        AuthMosel authMosel2=authService.create(authMosel);

        authMosel2.getBookModels().add(book);
       return authMosel2;


    }

    @GetMapping("/getAuthor/{id}")

    public Optional<AuthMosel> getAuthWithBook(@PathVariable String id){

        //=============================
        BookModel book = webClient
                .get()
                .uri("/getBookById/{id}", "10")
                .retrieve()
                .bodyToMono(BookModel.class)
                .block();
        //=================================

        Optional<AuthMosel> authMosel1=authService.getAuth(id);
        authMosel1.get().getBookModels().add(book);
        return Optional.of(authMosel1.get());


    }



}

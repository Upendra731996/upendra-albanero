package com.example.demo.controller;
import java.util.*;
import com.example.demo.model.ProductModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.beans.factory.annotation.Autowired;

@RestController

public class UserController {

    //=========================
    private WebClient webClient = WebClient.create("Http://localhost:8081");
    //====================
    @Autowired
    UserService userService;
    @PostMapping("/createUser")
    public UserModel createUserByDetails(@RequestBody UserModel userModel){
        return userService.createUser(userModel);
    }
    @GetMapping("/getUserById/{userId}")

    public UserModel getUserById(@PathVariable String userId){

        //=============

        List<ProductModel> productModelList=  webClient
                .get()
                .uri("getAllProduct")
                .retrieve()
                .bodyToFlux(ProductModel.class).collectList().block();
//
        //=========

        UserModel userModel= userService.getUser(userId);
        if(productModelList!=null) {

            for (int i = 0; i < productModelList.size(); i++) {
                userModel.getProductModels().add(productModelList.get(i));
            }
        }

        return userModel;
    }



}

package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RequestMapping("/user")

@RestController

public class UserController {
    @Autowired
    UserService userService;
    @PreAuthorize("hasRole('ADMIN')") // with the help of this line only admint can access this api
    @PostMapping("/userCreate")

    public UserModel UserPost(@RequestBody UserModel userModel){
        return userService.CreateUser(userModel);

    }
    @GetMapping("/getUser")
    public List<UserModel> getAllUser(){
        return userService.getUser();


    }
}

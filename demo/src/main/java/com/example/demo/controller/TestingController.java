package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")

public class TestingController {
    @GetMapping("/signin")
    public String TestingMethod(){
        return "login";
    }
}

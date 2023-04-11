package com.example.demo.controller;




import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/createData")
    public UserModel userCreate(@RequestBody UserModel userModel){
        return userService.createUser(userModel);
    }
    @GetMapping("/getData/{userId}")
    public UserModel userGet(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    @PutMapping("/updateData/{userId}")
    public UserModel userUpdate(@RequestBody UserModel userModel,@PathVariable String userId){
        return userService.updateUser(userModel,userId);
    }

    @DeleteMapping("/deleteData/{userId}")
    public String userDelete(@PathVariable String userId){
        System.out.println("this tratr id controller");
        return userService.deleteUser(userId);

    }

}
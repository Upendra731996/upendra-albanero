package com.example.demo.Controller;

import java.util.*;
import com.example.demo.Model.UserModel;
import com.example.demo.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/created")
    public ResponseEntity<UserModel> userCreate(@RequestBody UserModel userModel){
        if (userModel==null){
            return  new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        else {
          UserModel user= userService.create(userModel);
          return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
        }
    }

    @GetMapping("getUserById/{id}")
    public ResponseEntity<UserModel> getuserById(@PathVariable String id){
        if (null==id){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);

        }
      else {
            UserModel userModel=  userService.getUser(id);
            return new ResponseEntity<>(userModel,HttpStatus.ACCEPTED);
        }

    }
    @GetMapping("/getAllUser")

    public ResponseEntity<List<UserModel>> getUser(){

        List <UserModel>list= userService.getAll();
        return  new ResponseEntity<>(list,HttpStatus.ACCEPTED);
    }

    @PutMapping("UpdateUser/{id}")
    public ResponseEntity<UserModel> UpdateUser(@RequestBody UserModel userModel,@PathVariable String id){
        if (userModel==null || id==null){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);

        }
        else {
            userService.userUpddateById(userModel,id);
                    return new ResponseEntity<>(userModel,HttpStatus.ACCEPTED);
        }
    }
    @DeleteMapping("deteletUser/{id}")
    public ResponseEntity<String> deletById(@PathVariable String id){
        if (id==null){
            return new ResponseEntity<>("please provide valid user id",HttpStatus.BAD_REQUEST);
        }
        else
            userService.userDeted(id);
            return new ResponseEntity<>("deleted successfully",HttpStatus.ACCEPTED);
    }
}

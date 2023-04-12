package com.example.demo.service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;
    public UserModel CreateUser(UserModel userModel){
        return userRepository.save(userModel);
    }
    public List<UserModel> getUser(){
       return userRepository.findAll();
    }
}

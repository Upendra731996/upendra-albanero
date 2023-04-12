package com.example.demo.service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public UserModel createUser(UserModel userModel){
        return userRepository.save(userModel);
    }

    public UserModel getUser(String userId){
        return userRepository.findByUserId(userId);
    }
}

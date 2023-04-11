package com.example.demo.service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public UserModel createUser(UserModel userModel){
        return userRepository.save(userModel);
    }

    public UserModel getUserById(String userId){

        return userRepository.findByUserId(userId);

    }

    public UserModel updateUser(UserModel userModel, String userId){
        UserModel user=userRepository.findByUserId(userId);
        user.setUserName(userModel.getUserName());
        user.setUserId(userModel.getUserId());
        user.setAddress(userModel.getAddress());
     return    userRepository.save(user);


    }

    public String deleteUser(String userId){
        //System.out.println("this tratr id server");
        //UserModel user=userRepository.findByUserId(userId);
        //System.out.println("this tratr id sever02");
        userRepository.deleteByUserId(userId);
        //userRepository.delete(user);
        //System.out.println("this tratr id lsat");
        return "success";
    }

}

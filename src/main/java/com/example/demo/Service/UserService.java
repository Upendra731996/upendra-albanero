package com.example.demo.Service;

import com.example.demo.Model.UserModel;
import com.example.demo.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserModel create(UserModel userModel){
        return userRepository.save(userModel);

    }
    public UserModel getUser(String id){
        UserModel user= userRepository.findByid(id);
        return user;
    }
    public List<UserModel> getAll(){
        return userRepository.findAll();
    }

    public UserModel userUpddateById(UserModel userModel,String id){
        UserModel userModel1=userRepository.findByid(id);
        userModel.setId(userModel1.getId());
      return   userRepository.save(userModel1);
    }
    public String userDeted(String id){
        UserModel userModel=userRepository.findByid(id);
        userRepository.delete(userModel);
        return "success fully deleted";
    }

}

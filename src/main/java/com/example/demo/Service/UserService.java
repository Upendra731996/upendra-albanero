package com.example.demo.Service;
import java.util.List;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "New user has been created.";
    }
    public List<User> getUer(){
        List<User> list=userRepository.findAll();
        return list;
    }
    public  User updateUser(String id, User user){
        User l = userRepository.findById(id).get();
        user.setId(l.getId());
        return userRepository.save(user);
    }

    public String dell(String id){
        User dd = userRepository.findById(id).get();
        userRepository.delete(dd);

        return "delete successfully";
    }

}

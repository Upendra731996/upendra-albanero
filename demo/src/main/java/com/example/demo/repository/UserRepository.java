package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

@Repository

public interface UserRepository extends MongoRepository<UserModel,String> {
    public UserModel findByUserId(String userId);
    public void deleteByUserId(String userId);
}

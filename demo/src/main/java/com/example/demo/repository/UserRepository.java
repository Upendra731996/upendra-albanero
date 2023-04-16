package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByUsername(String userName);
}

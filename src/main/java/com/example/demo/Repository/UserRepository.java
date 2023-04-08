package com.example.demo.Repository;

import com.example.demo.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel,String>{

    UserModel findByid(String id);
}

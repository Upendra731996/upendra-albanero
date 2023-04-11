
package com.example.demo.repository;

import com.example.demo.model.AuthMosel;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

@Repository
public interface AuthRepository extends MongoRepository<AuthMosel,String> {

    public Optional<AuthMosel> findById(String id);


}
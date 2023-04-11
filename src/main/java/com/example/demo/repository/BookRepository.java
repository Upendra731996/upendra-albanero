package com.example.demo.repository;

import com.example.demo.model.BookModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends MongoRepository<BookModel, String> {

    public Optional<BookModel> findById(String id);
    public void deleteById(String id);
}

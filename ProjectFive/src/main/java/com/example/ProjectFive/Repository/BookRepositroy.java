package com.example.ProjectFive.Repository;


import com.example.ProjectFive.Model.BookModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepositroy extends MongoRepository<BookModel,String> {
    Optional<BookModel> findByBookId(int bookId);


    //BookModel findByBookId(int bookId);

}



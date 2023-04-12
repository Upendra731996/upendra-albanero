package com.example.demo.repository;

import com.example.demo.model.CartModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CartRepository extends MongoRepository<CartModel,String>{
//    CartModel findByUserName(String userName);

    CartModel findByCartId(String cartId);
}

package com.example.demo.repository;

import com.example.demo.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends MongoRepository <ProductModel,String>{
    ProductModel findByProductId(String productId);
}

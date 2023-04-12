package com.example.demo.repository;

import com.example.demo.model.OrderModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderModel,String> {
    OrderModel findByOrderId(String orderId);
}

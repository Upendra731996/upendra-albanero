package com.example.demo.service;

import com.example.demo.model.OrderModel;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public OrderModel createOrder(OrderModel orderModel){
        return orderRepository.save(orderModel);
    }

    public OrderModel getOrder(String orderId){
        return orderRepository.findByOrderId(orderId);
    }
}

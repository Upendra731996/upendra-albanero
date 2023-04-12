package com.example.demo.controller;

import com.example.demo.model.OrderModel;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient;

@Service

public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/createOrder")

    public OrderModel postOrder(@RequestBody OrderModel orderModel){

        //===================================

         WebClient webClient = WebClient.create("Http://localhost:8081");
        //==================================

        return orderService.createOrder(orderModel);
    }



    @GetMapping("/getOrderById")
    public OrderModel getOrderById(@PathVariable String orderId){
        return orderService.getOrder(orderId);

    }
}

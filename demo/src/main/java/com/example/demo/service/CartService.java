package com.example.demo.service;

import com.example.demo.controller.CartController;
import com.example.demo.model.CartModel;
import com.example.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CartService {

    @Autowired
    CartRepository cartRepository;

    public CartModel createCart(CartModel cartModel){
        return cartRepository.save(cartModel);
    }
    public CartModel getCart(String userName){
        return cartRepository.findByUserName(userName);
    }
}

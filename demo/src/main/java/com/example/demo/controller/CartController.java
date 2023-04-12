package com.example.demo.controller;

import com.example.demo.model.CartModel;
import com.example.demo.repository.CartRepository;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CartController {

    @Autowired
    CartService cartService;
    @PostMapping("createCart")

    public CartModel cartCreate(@RequestBody CartModel cartModel){
        return cartService.createCart(cartModel);
    }

    public CartModel getCartByUserName(@PathVariable String useNma){
        return cartService.getCart(useNma);
    }
}

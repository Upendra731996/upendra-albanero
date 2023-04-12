package com.example.demo.controller;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.CartModel;
import com.example.demo.model.ProductModel;
import com.example.demo.repository.CartRepository;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController

public class CartController {

    @Autowired
    CartService cartService;
    @PostMapping("/createCart/{productId}")

    public CartModel cartCreate(@RequestBody CartModel cartModel,@PathVariable String productId){

        WebClient webClient = WebClient.create("Http://localhost:8080");
        //==================================
        ProductModel productModel1 =  webClient
                .get()
                .uri("/getProduct/{productId}",productId)
                .retrieve()
                .bodyToMono(ProductModel.class).block();
        //=========
        cartModel.getProductModels().add(productModel1);
        CartModel cartModel1= cartService.createCart(cartModel);




        return cartModel1;
    }
    @GetMapping("/getCart/{cartId}")

    public CartModel getCartByUserName(@PathVariable String cartId){
        return cartService.getCart(cartId);
    }
}

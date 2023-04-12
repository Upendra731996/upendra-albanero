package com.example.demo.controller;

import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("/createProduct")

    public ProductModel createProductByProduct(@RequestBody ProductModel productModel) {
        return productService.createProduct(productModel);
    }
    @GetMapping("/getProduct/{productId}")
    public ProductModel productCreate(@PathVariable String productId){
        return  productService.getProductById(productId);
    }

    @GetMapping("/getAllProduct")

    public List<ProductModel> getAllProduct(){
        return productService.allProduct();
    }
}

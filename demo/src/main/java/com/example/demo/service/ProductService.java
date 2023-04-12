package com.example.demo.service;

import com.example.demo.model.ProductModel;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public ProductModel createProduct(ProductModel productModel){
        return (ProductModel) productRepository.save(productModel);
    }
    public ProductModel getProductById(String productId){
        return productRepository.findByProductId(productId);
    }

    public List<ProductModel> allProduct(){
        return productRepository.findAll();
    }
}

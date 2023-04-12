package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productCollection")
@Data

public class ProductModel {
    private int price;
    private String productName;
    private String productId;


}


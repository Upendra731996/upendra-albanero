package com.example.demo.model;

import com.example.demo.model.ProductModel;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "cartCollection")
@Data

public class CartModel {
    private String cartId;
    private String userName;
    List<ProductModel> productModels= new ArrayList<>();


}

package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "tesUser")

@Data
public class UserModel {
    private String userName;
    private String userId;
    private String address;

    List <ProductModel> productModels=new ArrayList<>();

}

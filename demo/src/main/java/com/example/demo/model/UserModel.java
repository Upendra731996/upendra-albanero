package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "UserCollection")
public class UserModel {

    private String userName;
    private String userId;
    private String address;





    public UserModel(String userName, String userId, String address) {
        this.userName = userName;
        this.userId = userId;
        this.address = address;
    }

    public UserModel() {

    }
    public UserModel(String userName,String address){
        this.userName = userName;
        this.address = address;
    }



}

package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;



import lombok.Data;
@Document(collection = "userCollection")
@Data
public class UserModel {
    private String userName;
    private long mobile;
    private String email;
    private String password;
    private String address;

    public UserModel(String userName, long mobile, String email, String password, String address) {
        this.userName = userName;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public UserModel() {
    }
}

package com.example.demo.Model;

import lombok.Data;

@Data
public class UserModel {
    private String id;
    private String fullname;
    private String email;
    private String password;

    public UserModel(String id, String fullname, String email, String password) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }

    public UserModel() {

    }
}

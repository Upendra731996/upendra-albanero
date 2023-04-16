package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.Collection;


@Document(collection = "userCollection")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;

}


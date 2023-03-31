package com.example.demo.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private String id;

    private String fname;
    private String lname;
    private String email;
    private long mobile;
    private String city;

}

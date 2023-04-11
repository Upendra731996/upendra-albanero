package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List.*;
import java.util.Collections;
import java.util.List;


@Document(collection = "authCollection")

@Data
public class AuthMosel {
    private String authorName;
    private int age;
    private String id;
    List<BookModel> bookModels=new ArrayList<>();
}

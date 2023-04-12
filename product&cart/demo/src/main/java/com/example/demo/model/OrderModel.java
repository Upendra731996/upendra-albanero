package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orderCollection")

@Data

public class OrderModel {
    private String orderId;
    private String userName;
    private Boolean status;
}

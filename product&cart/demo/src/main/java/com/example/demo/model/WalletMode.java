package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "walletCollection")

@Data

public class WalletMode {
    private int totalPrice;
    private String walletId;

}

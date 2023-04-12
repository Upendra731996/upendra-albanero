package com.example.demo.repository;

import com.example.demo.model.WalletMode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface WalletRepository extends MongoRepository<WalletMode,String> {

    WalletMode findByWalletId(String walletId);
}

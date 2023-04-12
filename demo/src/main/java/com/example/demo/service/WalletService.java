package com.example.demo.service;

import com.example.demo.model.WalletMode;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WalletService {

    @Autowired
    WalletRepository walletRepository;

    public WalletMode createWallet(WalletMode walletMode){
        return walletRepository.save(walletMode);
    }

    public WalletMode getWallet(String walletId){
       return walletRepository.findByWalletId(walletId);
    }

    public WalletMode updateWallet(WalletMode walletMode,String id){

        Optional<WalletMode> walletMode1= Optional.of(walletRepository.findById(id).get());




    }
}

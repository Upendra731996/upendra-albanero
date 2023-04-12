package com.example.demo.controller;

import com.example.demo.model.WalletMode;
import com.example.demo.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class WalletController {
    @Autowired
    WalletService walletService;

    @PostMapping("/walletPost")
    public WalletMode addWallet(@RequestBody WalletMode walletMode){
       return walletService.createWallet(walletMode);
    }
    @GetMapping("/getWallet/{walletId}")
    public WalletMode getWalletById(@PathVariable String walletId){
        return walletService.getWallet(walletId);
    }

    @PutMapping("/updateWallet/{walletId}")

    public WalletMode updateWallet(@RequestBody WalletMode walletMode,@PathVariable String walletId){

        return walletService.updateWallet(walletMode,walletId);

    }
}

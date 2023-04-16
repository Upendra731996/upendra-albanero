package com.example.demo.controller;

import com.example.demo.entity.AuthRequest;
import com.example.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtUtil jwtUtil;

//    public String welcome(){
//        return "this is string";
//    }


    @PostMapping("/token")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception{

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName(),authRequest.getPassword()));

        }
        catch (Exception ex){
            throw new Exception("invalis username/pasword");
        }

return jwtUtil.generateToken(authRequest.getUserName());

    }
}

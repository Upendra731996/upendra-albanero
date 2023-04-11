package com.example.demo.server;

import com.example.demo.model.AuthMosel;
import com.example.demo.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    static
    AuthRepository authRepository;
    public AuthMosel create(AuthMosel authMosel){

        return authRepository.save(authMosel);
    }

    public Optional<AuthMosel> getAuth(String id){

        Optional<AuthMosel> authMosel= authRepository.findById(id);
        return Optional.of(authMosel.get());
    }




}

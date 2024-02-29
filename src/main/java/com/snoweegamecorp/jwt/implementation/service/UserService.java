package com.snoweegamecorp.jwt.implementation.service;

import com.snoweegamecorp.jwt.implementation.model.User;
import com.snoweegamecorp.jwt.implementation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createUser(User user){
        String pass = user.getPassword();
        user.setPassword(
                passwordEncoder.
                        encode(pass));
        repository.save(user);
    }
}

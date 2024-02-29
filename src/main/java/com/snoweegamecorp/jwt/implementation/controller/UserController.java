package com.snoweegamecorp.jwt.implementation.controller;

import com.snoweegamecorp.jwt.implementation.model.User;
import com.snoweegamecorp.jwt.implementation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping
    public void insertNewUser(@RequestBody User user){
        service.createUser(user);
    }
}

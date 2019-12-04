package com.zw.gjob.huntingservice.controller;

import com.zw.gjob.commonsservice.entity.User;
import com.zw.gjob.huntingservice.client.AccountServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private AccountServiceClient accountServiceClient;

    @PostMapping("login")
    public Object login(@RequestBody User user) {
       return accountServiceClient.getAccessToken(user);
    }

    @PostMapping("register")
    public Object register(@RequestBody User user) {
        return accountServiceClient.save(user);
    }
}

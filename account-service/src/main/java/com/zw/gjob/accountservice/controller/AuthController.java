package com.zw.gjob.accountservice.controller;

import com.zw.gjob.commons.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    @PostMapping("getAccessToken")
    public Object getAccessToken(@RequestBody User user) {
        return "hahaha : " + user.getName();
    }

    @PostMapping("save")
    public Object save(@RequestBody User user) {
        System.out.println(user.getName());
        return true;
    }
}

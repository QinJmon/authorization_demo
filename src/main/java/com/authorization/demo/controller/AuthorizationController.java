package com.authorization.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

    @GetMapping("/callback")
    public String callback(){
        return "xxxx callback!";
    }
}

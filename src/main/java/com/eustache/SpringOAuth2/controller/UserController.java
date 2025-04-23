package com.eustache.SpringOAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String index() {
        return "Welcome to Eustache Spring OAuth2";
    }
}

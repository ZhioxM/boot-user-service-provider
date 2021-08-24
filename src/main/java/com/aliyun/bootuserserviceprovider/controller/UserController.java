package com.aliyun.bootuserserviceprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("hello")
    String list() {
        return "hello git";
    }

    @GetMapping("hello")
    String hello() {
        return "hello git";
    }
}

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

    @GetMapping("hello")
    String hello2() {
        return "hello git";
    }

    @GetMapping("hello")
    String hello3() {
        return "hello git devlop";
    }

    @GetMapping("hello")
    String hello4() {
        // 测试拉取
        return "hello git push";
    }

}

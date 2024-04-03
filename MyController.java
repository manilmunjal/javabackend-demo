// package com.example;



@RestController
public class MyController {
    @GetMapping("/")
    public String hello() {
        return "Hello, world!";
    }
}


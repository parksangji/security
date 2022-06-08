package com.comdolidoli.ToyProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "HELLO WORLD";
    }
}

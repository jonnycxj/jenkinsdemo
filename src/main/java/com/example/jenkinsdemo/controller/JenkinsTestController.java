package com.example.jenkinsdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {


    @GetMapping("/")
    public String login() {
        return "hello jenkins!!!";
    }
}

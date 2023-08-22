package com.example.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    // mapping for getting home page
    @GetMapping("/home")
    public String home() {
        return "";
    }
}

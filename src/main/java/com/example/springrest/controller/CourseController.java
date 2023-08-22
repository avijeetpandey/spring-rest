package com.example.springrest.controller;

import com.example.springrest.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    // mapping for getting all courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return new ArrayList<>();
    }
}

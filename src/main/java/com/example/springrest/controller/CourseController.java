package com.example.springrest.controller;

import com.example.springrest.entity.Course;
import com.example.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService service;

    // mapping for getting all courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.service.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.service.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses/add")
    public Course addCourse(@RequestBody Course course){
        return this.service.addCourse(course);
    }
}

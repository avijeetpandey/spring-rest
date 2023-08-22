package com.example.springrest.controller;

import com.example.springrest.entity.Course;
import com.example.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Course addCourse(@RequestBody Course course) {
        return this.service.addCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            this.service.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

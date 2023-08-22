package com.example.springrest.services;

import com.example.springrest.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(Long courseId);
    public Course addCourse(Course course);

    public void deleteCourse(Long courseId);
}

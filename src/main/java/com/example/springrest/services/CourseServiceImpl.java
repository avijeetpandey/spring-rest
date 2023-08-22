package com.example.springrest.services;

import com.example.springrest.dao.CourseDao;
import com.example.springrest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseDao courseDao;

    // default constructor
    public CourseServiceImpl() {}

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(Long courseId) {
        return  courseDao.getReferenceById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(Long courseId) {
        Course course = courseDao.getReferenceById(courseId);
        courseDao.delete(course);
    }
}


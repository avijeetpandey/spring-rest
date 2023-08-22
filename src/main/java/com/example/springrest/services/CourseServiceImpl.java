package com.example.springrest.services;

import com.example.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    // default constructor
    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(123,"Title one","description one"));
        list.add(new Course(124,"Title two","description two"));
        list.add(new Course(125,"Title three","description three"));
    }

    @Override
    public List<Course> getCourses() {
        return this.list;
    }

    @Override
    public Course getCourse(Long courseId) {
        for(Course item: list){
            if(item.getId() == courseId){
                return item;
            }
        }
        return null;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course deleteCourse(Long courseId) {
        Course course = this.getCourse(courseId);
         boolean isRemoved  = list.remove(course);
         return isRemoved ? course : null;
    }
}


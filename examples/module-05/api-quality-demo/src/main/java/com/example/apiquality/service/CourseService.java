package com.example.apiquality.service;

import com.example.apiquality.model.Course;
import com.example.apiquality.repository.CourseRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        logger.info("Fetching all courses");
        return courseRepository.findAll();
    }

    public Course createCourse(Course course) {
        logger.info("Creating a new course with title: {}", course.getTitle());
        return courseRepository.save(course);
    }
}

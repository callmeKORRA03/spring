package com.example.apiquality.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.apiquality.model.Course;
import com.example.apiquality.repository.CourseRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@DataJpaTest
@Import(CourseServiceTest.TestConfig.class)
public class CourseServiceTest {

    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void shouldCreateCourse() {
        Course course = new Course();
        course.setTitle("Spring Boot Testing");
        course.setInstructor("Favour");

        Course saved = courseService.createCourse(course);

        assertEquals("Spring Boot Testing", saved.getTitle());
    }

    @Test
    void shouldGetAllCourses() {
        courseRepository.save(new Course(null, "Java", "Aptech"));
        courseRepository.save(new Course(null, "Spring", "Favour"));

        List<Course> courses = courseService.getAllCourses();

        assertEquals(2, courses.size());
    }

    @TestConfiguration
    static class TestConfig {
        @Bean
        CourseService courseService(CourseRepository courseRepository) {
            return new CourseService(courseRepository);
        }
    }
}

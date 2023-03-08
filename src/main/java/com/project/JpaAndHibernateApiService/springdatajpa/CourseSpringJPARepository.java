package com.project.JpaAndHibernateApiService.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.JpaAndHibernateApiService.Course;

public interface CourseSpringJPARepository extends JpaRepository<Course , Long> {

    // We can create our own custom methods
    List<Course> findByAuthor(String author);
    
}

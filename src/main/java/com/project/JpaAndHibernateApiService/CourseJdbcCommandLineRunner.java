package com.project.JpaAndHibernateApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.JpaAndHibernateApiService.springdatajpa.CourseSpringJPARepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

    // @Autowired
    // private CourseJDBCRepository courseJDBCRepository;

    // @Autowired
    // private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringJPARepository courseSpringJPARepository;

    @Override
    public void run(String... args) throws Exception {
        
        // courseJDBCRepository.insert();
        // courseJDBCRepository.insert2(new Course(2, "Kanishk Bansal", "Apple"));
        // courseJDBCRepository.delete(2);

        // // It will give you the values as null because there are no setters in Course class.
        // System.out.println(courseJDBCRepository.select(3));

        // courseJpaRepository.insert(new Course(1, "Kubernetes", "Amdocs"));
        // courseJpaRepository.insert(new Course(2, "Docker", "Red Hat"));
        // courseJpaRepository.insert(new Course(3, "Postman", "Accenture"));

        // courseJpaRepository.deleteById(2);

        // System.out.println(courseJpaRepository.findById(1));
        // System.out.println(courseJpaRepository.findById(3));

        courseSpringJPARepository.save(new Course(1, "Kubernetes", "Amdocs"));
        courseSpringJPARepository.save(new Course(2, "Docker", "Red Hat"));
        courseSpringJPARepository.save(new Course(3, "Postman", "Accenture"));

        // courseSpringJPARepository.deleteById(2l);

        System.out.println(courseSpringJPARepository.findById(1l));

        System.out.println(courseSpringJPARepository.findByAuthor("Red Hat"));
    }
    
}

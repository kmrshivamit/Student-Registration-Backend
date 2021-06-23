package com.shivam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.model.Course;

public interface CourseRepo extends JpaRepository<Course
, Long> {

}

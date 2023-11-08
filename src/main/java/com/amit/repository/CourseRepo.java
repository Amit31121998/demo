package com.amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer>  {

}

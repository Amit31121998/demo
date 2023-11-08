package com.amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entity.StudentEnqEntity;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity, Integer> {

}

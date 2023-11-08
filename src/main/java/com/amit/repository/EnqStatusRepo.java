package com.amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entity.EnqStatusEntity;

public interface EnqStatusRepo extends JpaRepository<EnqStatusEntity, Integer>{

}

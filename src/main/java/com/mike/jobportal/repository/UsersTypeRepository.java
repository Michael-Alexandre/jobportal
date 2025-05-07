package com.mike.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mike.jobportal.entity.UsersType;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {
    // Custom query methods defined
    
}

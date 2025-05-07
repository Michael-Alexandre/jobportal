package com.mike.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mike.jobportal.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    
}

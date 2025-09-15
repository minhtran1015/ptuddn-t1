package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    // JpaRepository provides all the basic CRUD operations
    // Additional custom query methods can be added here if needed
}
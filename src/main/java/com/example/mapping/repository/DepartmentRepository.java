package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}

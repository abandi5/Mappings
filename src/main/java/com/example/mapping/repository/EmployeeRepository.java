package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

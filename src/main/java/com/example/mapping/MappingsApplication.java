package com.example.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mapping.employee.Employee;
import com.example.mapping.entity.Department;
import com.example.mapping.repository.DepartmentRepository;

@SpringBootApplication
public class MappingsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MappingsApplication.class, args);
	}
	
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Department department= new Department("IT");
		Employee emp1 = new Employee("Software Engineer", "ArunKumar");
		Employee emp2 = new Employee("Software Engineer", "Mahesh");
		Employee emp3 = new Employee("Software Engineer", "Ramesh");
		
		
	 department.getEmployees().add(emp1);
	 department.getEmployees().add(emp2);
	 department.getEmployees().add(emp3);
	 
	 departmentRepository.save(department);
		
		
		
	}

}

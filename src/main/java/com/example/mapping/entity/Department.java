package com.example.mapping.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import com.example.mapping.employee.Employee;

@Entity
public class Department {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_id;
	private String departmentName;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="pc_fid",referencedColumnName = "dept_id")
	List<Employee> employees = new ArrayList<>();
	
	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department()
	{
		
	}
	
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
	
	
	/**
	 * @return the id
	 */
	public int getdept_Id() {
		return dept_id;
	}
	/**
	 * @param id the id to set
	 */
	public void setdept_Id(int dept_id) {
		this.dept_id = dept_id;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	
	
}

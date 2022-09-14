package com.example.mapping.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String employeeDesgnation;
	private String employeeName;
	
	
	public Employee()
	{
		
	}
	
	public Employee(String employeeDesgnation, String employeeName) {
		super();
		this.employeeDesgnation = employeeDesgnation;
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeDesgnation
	 */
	public String getEmployeeDesgnation() {
		return employeeDesgnation;
	}
	/**
	 * @param employeeDesgnation the employeeDesgnation to set
	 */
	public void setEmployeeDesgnation(String employeeDesgnation) {
		this.employeeDesgnation = employeeDesgnation;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
	
}

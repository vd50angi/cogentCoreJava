package com.cogent.EmployeeManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Employee {
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	public Employee() {
		this.employeeId="";
		//explicit default constructor
		
		
		//public class EmployeeDepartment {
		//department.employeeDept();
		//String departmentA = "Accounting";
		
		
		
	}
}
	
















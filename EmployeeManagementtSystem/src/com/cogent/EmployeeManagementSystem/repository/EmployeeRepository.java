package com.cogent.EmployeeManagementSystem.repository;

import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeRepository {

	
	// Employee: classs name --then employees[] array of references
	// in java we dont have array of objects but we have array of reference

// new : will do run time (RT) allocation of references of 10 based on the code above its 10
	
	private Employee employees[] = new Employee[10];
	
	private static EmployeeRepository employeeRepository;
	private EmployeeRepository() {
		// private constructor/ only one private constructor
	
	}
	public static EmployeeRepository getInstance() {
		if(employeeRepository ==null) {
			employeeRepository = new EmployeeRepository(); //create an object
			return employeeRepository;  //return method
		}
		return employeeRepository; // only one object on this method
	}
	
	 static int counter = 0;
	
	public String addEmployee(Employee employee) {
		
		if(counter>=employees.length) {
			return "array is full";
			
		}
		employees[counter++] = employee;
		return"success";
		
		
	//
	
	
}
	// this method should give us employee details on the basis of id
	
	public Employee getEmployeeById(String id) {
     
		for (Employee employee : employees) {
			
			if( employee!=null &&id.equals(employee.getEmployeeId()) ) {
				return employee;
				
			}
		}

	return null;
	}
	
}
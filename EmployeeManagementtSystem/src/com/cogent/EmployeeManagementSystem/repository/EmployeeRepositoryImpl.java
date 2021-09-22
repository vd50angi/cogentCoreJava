package com.cogent.EmployeeManagementSystem.repository;

import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeeRepository{

		
	private Employee employees[] = new Employee[10];
	
	private static EmployeeRepositoryImpl employeeRepository;
	
	
	private EmployeeRepositoryImpl() {
		// private constructor/ only one private constructor
	
	}
	public static EmployeeRepositoryImpl getInstance() {
		if(employeeRepository ==null) {
			employeeRepository = new EmployeeRepositoryImpl(); //create an object
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
	public Employee[] getEmployees() {
		return employees;
	}
	public String deleteEmployeeById(String id) {
		//1 that id exist or not
		
		Employee employee = this.getEmployeeById(id);
		
		if(employee!=null ) {
					//record found
					// we need to set null
					//id exist then set null to location
					//if return notfound
					
		
		
		int index = this.getIndex(employee);
		if( index!=-1) {
			//record found
			employees[index] = null;
			return "Success";
			//we need to set null
		
	
		
		//Employee employee = this.getEmployeeById(id);
		
		//if(employee!=null ) {
			//record found
			// we need to set null
			//id exist then set null to location
			//if return notfound
			
			
		} else {
			return "not found";
			
	}
			//private int getIndex(String id)
			
		//if employee is in the array it should return -1
				
			private int getIndex(Employee employee) {		
				for (int i = 0; i <employees.length; i++) {
					
					if(employees[i].equals(employee)) {
						return i;
					}
				}
				
				return -1;
					}
			@Override
			public void deleteAllEmployees() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public String updateEmployee(String id, Employee employee) {
				// TODO Auto-generated method stub
				return null;
			}
				
				
				
			}


 //Employee: classs name --then employees[] array of references
// in java we dont have array of objects but we have array of reference

//new : will do run time (RT) allocation of references of 10 based on the code above its 10





//link to check your code

//https://codeshare.io/AdDqBl
//https://codeshare.io/AdDqBl

		//https://codeshare.io/AdDqBl
		//	https://codeshare.io/AdDqBl
		//	From Levi Costello to Everyone:  04:50 PM
		//	https://github.com/abhinandanchivate/CogentBatch58
		//	https://github.com/abhinandanchivate/cogentCoreJava

			
			
		
		
	

	
	
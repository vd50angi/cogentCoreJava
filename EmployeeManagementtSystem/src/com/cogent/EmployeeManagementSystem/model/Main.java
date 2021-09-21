package com.cogent.EmployeeManagementSystem.model;

import com.cogent.EmployeeManagementSystem.service.EmployeeService;

public class Main {
	
	public static void main(String[]args) {
		
		EmployeeService employeeService=new EmployeeService();
		 
		Employee employee = new Employee();
		 
		 	 		
		Employee employee2 = new Employee("angi001", "dev","angie", 100.0f,"VA");	
		String result  =  employeeService.addEmployee(employee);
		
		System.out.println(result);
		
		public Employee getEmployeeById(String id) {
			return employeeRepository.getEmployeeById(id);
		
		
		
		// employee is a  local reference of an object because it declared in main method
		//all local reference must be initialized if not then it will give error that variable/ ref might not be initialized
		//when your declaring a reference then either assign an object or assign a null reference--either assign an oject
		
		//ex. Employee employee3; its declared then initialized
		
		//Employee employee = new Employee();
		//Employee employee3 = null;
		//int a= 10;
		//System.out.println(a);
		
			//	Employee employee2 = new Employee
				//		("ab001", "abhi","chivate", 100.0f,"PA");	
		
			//System.out.println(employee2.getEmployeeId());
					//System.out.println(employee3.getAddress());
			
		//Employee employees[] = new Employee[10];
		//for (int i = 0; i < employees.length; i++) {
		//	employees[i] = new Employee();
		//}
		
		//for(Employee employee4 : employees) {
			//System.out.println(employee4);
		//}
		
	}
}
			
			
	
		
		 
	
	


		
		




package com.cogent.EmployeeManagementSystem.model;

import com.cogent.EmployeeManagementSystem.model.Employee;

import com.cogent.EmployeeManagementSystem.service.EmployeeService;

//import com.cogent.EmployeeManagementSystem.service.EmployeeService;
//import com.cogent.EmployeeManagementSystem.service.EmployeeServiceImpl;

public class Main {
	
		
	public static void main(String[] args) {
        
		
		EmployeeService employeeService =EmployeeServiceImpl.getInstance();
		//EmployeeServiceImpl employeeService = new EmplEmployeeService employeeService =EmployeeServiceImpl.getInstance();oyeeServiceImpl();
		
	String result = null;
	try {
		result = employeeService.addEmployee(new Employee("ad001", "angi", "deveg", 1234.0f));
	} catch (InvalidSalaryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	if("success".equals(result)) {
		System.out.println("employee added successfully");
	}
		
	

	}


	
	
	
	
	
	
	
	//EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		//EmployeeService employeeService =EmployeeServiceImpl.getInstance();
		 String result = null;
	     //String result = employeeService.addEmployeenew Employee("angi001", "dev","angie", 100.0f,"VA");
	     //  try {
				//employee.setEmpSalary(500.f);
			//} catch (InvalidSalaryException e) {
				// TODO: handle exception
			//e.printStackTrace();
			//}
				
			//if("success".equals(result)) 
			//{	
			//	System.out.println ("employee added succesfully");
			//}
}
	     
	     
	   //Employee[]employees = employeeService.getEmployees() {
	    			
	    				
	     
	     
		
			
		 
			
			//for (Employee employee2 : employees) {
		//	System.out.println(employee2);
		//}
		//employeeService.getEmployeeByName("Angie");
		//employeeService.deleteAllEmployeeByName();
		//employeeService.updateEmployee("Angie", employee);
		
			
		}
}
	
	}

	/*
	public static void main(String[]args) {
						
		EmployeeService  service =  EmployeeService.getInstance();
		
		
		Employee employee = new  Employee("001", "Angi", "Deveg", 10000.0f, "VA");
		
		String result = service.addEmployee(employee);
		
		System.out.println(result);*/
				
		
	
	
	
		
		//public Employee getEmployeeById(String id) {
		//	return employeeRepository.getEmployeeById(id);
		
		
		
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
		
	

			
			
	
		
		 
	
	


		
		




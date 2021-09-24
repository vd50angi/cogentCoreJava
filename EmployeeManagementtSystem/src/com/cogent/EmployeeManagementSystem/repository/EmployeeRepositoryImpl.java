package com.cogent.EmployeeManagementSystem.repository;

import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

		
	private Employee employees[] = new Employee[10];
	
	private static EmployeeRepositoryImpl employeeRepository;// used to create singleton class
	
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
		 static int counter = 0;// static creates one single copy in memory
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
				
		int index = this.getIndex(employee);// this refers to current object
		
		if( index!=-1) {
			//record found
			employees[index] = null;
			return "Success";
			
		} else {
			return "not found";
			
	}		
		//if employee is in the array it should return -1*/
		}
		  return "not found";
	}
			private int getIndex(Employee employee) {		
				for (int i = 0; i <employees.length; i++) {
					
					if(employees[i].equals(employee)) {
						return i;
					}
				}
				
				return -1;
					}
			@Override //deleteAllEmployees
			
			public void deleteAllEmployees() {
				// TODO Auto-generated method stub
				employees = null;
				}
			
			@Override //update employees
			public String updateEmployee(String id, Employee employee) {
				return id;
				// TODO Auto-generated method stub
			}
							
			
			//private static int index = 0;
			// search employee basis by name
		 public Employee getEmployeesById(String name) {
			
			 Employee[] employeeTemp = new Employee[employees.length];
			 
			 for(Employee employee : employees) {
				   if(employee.getFirstName().equals(name)) {
						//  employeesTemp [index++] = employee;
					  }
				  }
				  return null;
			  }
			}
				
			                                                                                             


 /*Employee: classs name --then employees[] array of references
 in java we dont have array of objects but we have array of reference

new : will do run time (RT) allocation of references of 10 based on the code above its 10*/


			//we need to set null
			//Employee employee = this.getEmployeeById(id);
			
			//if(employee!=null ) {
				//record found
				// we need to set null
				//id exist then set null to location
				//if return notfound


			/*2. id exist then set nuill to location?
			 * 3. if id does not exist return not found
			 * 	private int getIndex(String id)
			 */

				
				//public static void main(String[]args)
				
				//this.getEmployeeById(id);
				
				//this.getIndex(employee)
				
				
				//return null;
		
	

	
	
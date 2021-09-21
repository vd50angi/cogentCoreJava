package com.cogent.EmployeeManagementSystem.service;


import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepository;

public class EmployeeService {
	
	EmployeeRepository employeeRepository = new EmployeeRepository();
	
	
	public String addEmployee(Employee employee) {
		
		return employeeRepository.addEmployee(employee);
	}

	
public Employee getEmployeeById(String id) {
	return employeeRepository.getEmployeeById(id){
		
		
	}
	// just add this part ..I'm not sure if its correct
		public static EmployeeService getInstance() {
			if(employeeService ==null) {
				employeeService = new EmployeeService(); //create an object
				return employeeService;  //return method
			}
			return employeeService; // only one object on this method
		// end here
}

}
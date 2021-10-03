package com.cogent.EmployeeManagementSystem.service;

import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;


public interface EmployeeService {
	
	
		
		
		public String addEmployee(Employee employee);
		public String deleteEmployeeById(String id) throws IdNotFoundException, IOException;
		public void deleteAllEmployees();
		public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException;
		public List<Employee> getEmployees();
		public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException;
		public boolean isEmployeeExist(String Id);
	
	}

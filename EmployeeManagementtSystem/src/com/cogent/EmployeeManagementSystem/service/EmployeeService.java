package com.cogent.EmployeeManagementSystem.service;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepository;

public interface EmployeeService {
	
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id);
	public Employee[] getEmployee();
	public String updateEmployee(String id, Employee employee);
	public Employee[] getEmployeesByName(String name);
	public EmployeeRepository getInstance();
	
	
	

}

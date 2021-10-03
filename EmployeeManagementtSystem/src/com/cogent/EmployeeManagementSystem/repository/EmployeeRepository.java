package com.cogent.EmployeeManagementSystem.repository;
import java.io.IOException;
import java.util.List;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;

public interface EmployeeRepository {
	
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException;
	public void deleteAllEmployees();
	public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException;
	public List<Employee> getEmployees();
	public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException;
	public boolean isEmployeeExist(String Id);
	}


//public String addEmployee(Employee employee );
//public String deleteEmployeeById(String id);
//public String deleteEmployeeById(String id) throws IdNotFoundException, IOException;
//public void deleteAllEmployees();
//public Employee getEmployeeById(String id);
//public Employee[] getEmployees();
//public Employee getEmployeeById(String id) throws IdNotFoundException, IOException;
//public List<Employee> getEmployees();
//public String updateEmployee(String id, Employee employee);
//public boolean isEmployeeExist(String id);

package com.cogent.EmployeeManagementSystem.service;


import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepository;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl {
	
	EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
  
	//interface used in coupling
	//loose coupling
	//EmployeeRepository employeeRepository = new EmployeeRepository();
		private static EmployeeService employeeService;
		private void EmployeeserviceImpl()
	
	{
}
	public static EmployeeService getInstance ()
	{
		if (employeeService == null)
		{
	 employeeService = new EmployeeServiceImpl();
	 return employeeService;
 }
    return employeeService;

}
	
	public String addEmployee(Employee employee) {
		
		return employeeRepository.addEmployee(employee);
	}

	
public Employee getEmployeeById(String id) {
	return employeeRepository.getEmployeeById(id);
		
	}
		
		
	public Employee[] getEmployees() {
	return employeeRepository.getEmployees();
	}
	// just add this part ..I'm not sure if its correct
	//	public static EmployeeService getInstance() {
		//	if(employeeService ==null) {
		//		employeeService = new EmployeeService(); //create an object
		//		return employeeService;  //return method
		//	}
		//	return employeeService; // only one object on this method
		// end here
}


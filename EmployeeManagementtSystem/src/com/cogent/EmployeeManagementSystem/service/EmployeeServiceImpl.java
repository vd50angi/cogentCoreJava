 package com.cogent.EmployeeManagementSystem.service;



import lombok.ToString;
import java.io.IOException;
import java.util.List;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepositoryALImpl;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepositoryImpl;
import com.cogent.emsmongodb.exception.EmployeeRepository;


public class EmployeeServiceImpl {
	EmployeeRepository employeeRepository= EmployeeRepositoryALImpl.getInstance();
	//are we consuming repo
	// loos
	public String addEmployee(Employee employee) {
		
		return employeeRepository.addEmployee(employee);
	}
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeByID(id);
	}
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.deleteEmployeeById(id);
	}

	private static EmployeeService employeeService;
	private EmployeeServiceImpl() {}
	public static EmployeeService getInstance() {
		if(employeeService==null) {
			employeeService = new EmployeeServiceImpl();
			return employeeService;
		}
		return employeeService; 
	}
	@Override
	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();
		
	}
	@Override
	public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeByID(id);
	}
	@Override
	public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		return employeeRepository.upddateEmployee(id, employee);
	}
	@Override
	public boolean isEmployeeExist(String Id) {
		// TODO Auto-generated method stub
		return employeeRepository.isEmployeeExist(Id);
	}
	}
	
	
	
	
	
	
	/*EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	EmployeeRepository employeeRepository = EmployeeRepositoryALImpl.getInstance();
	// are we consuming the repo?

	// loose coupling : 
  //public String addEmployee(Employee employee) {

	//}

	public Employee getEmployeeById(String id) {
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeById(id);
	}

	public Employee[] getEmployees() {
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
		
		//EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
		//EmployeeRepository employeeRepository = EmployeeRepositoryALImpl.getInstance();
		// are we consuming the repo?
	}
	  }
	

	@Override
	
	public boolean isEmployeeExists(String id) {
		
		
		for(Employee employee : employees) {
			if(id.equals(employee.getEmployeeId())) {
				//return true; 
			}
		}
					
		return false;
	}
	
	@Override
	public List<addEmployee>(Employee employee) {
		
		//return employeeRepository.addEmployee(employee);
	}
 
	
	
	
	@Override
  public List <updateEmployee> (String EmployeeId, Employee employee)  throws IdNotFoundException, IOException{
	 
	 return employeeRepository.updateEmployee(EmployeeId, employee);
	  return null;
	}
	
	@Override
	public List<Employee> getEmployeeById(String Id) throws IdNotFoundException, IOException {
		//return employeeRepository.getEmployeeById(Id);
	}
		
	@Override	
     public Employee[] getEmployee() {
	
		return employeeRepository.getEmployees();
		return null;
	}
	
	@Override	
	
	public List<Employee> getEmployees() {
	return employeeRepository.getEmployees();
		Employee employeeRepository[] = new Employee[employees.size()]; //.size it will give size to an array
		
		return employees.toArray(employee); // will be taken care of two array method
  		return employeeRepository.getEmployees();
  		
  		return null;
	}
	
	private static EmployeeService employeeservice;
	
	public static EmployeeService getInstance();
	   if(employeeService==null) {
		  employeeservice = newEmployeeServiceImpl();
		   return employeeService;
	   }
	
	   return employeeService;
	   
  }
	
   @Override
 
	 public String deleteEmployeeById(String Id) throws IdNotFoundException, IOException { 
	  return employeeRepository.deleteEmployeeById(Id);
	   return null;
   }
   
   @Override
  
	 public void deleteAllEmployees() {
	  return  employeeRepository.deleteAllEmployees();
	   employeeRepository.deleteAllEmployees();
   }
	@Override
	public Employee[] getEmployeeByName(String name) {
		return employeeRepository.getEmployeeByName(name);
	   return employeeRepository.getEmployees();
	}
		
	}


   */
	
	
	
	//******************
	
	
	
	
	
	//EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	//EmployeeRepository employeeRepository = EmployeeRepositoryALImpl.getInstance();
	// are we consuming the repo?

	// loose coupling : 
  //public String addEmployee(Employee employee) {

	//}

	//public Employee getEmployeeById(String id) {
	//public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		//return employeeRepository.getEmployeeById(id);
	//}

	//public Employee[] getEmployees() {
	//public List<Employee> getEmployees() {
		//return employeeRepository.getEmployees();
	//}

	//EmployeeRepository employeeRepository = EmployeeRepositoryALImpl.getInstance();
  	//interface import lombok.ToString;
	
	
	
	//public class IdNotFoundException extends Exception { //checked exception
		
     // public IdNotFoundException(String message) {
    	  // constructor stub
	
    	  //super(message); // call the base class constructor
//}
	
//}

	//loose coupling
	//EmployeeRepository employeeRepository = new EmployeeRepository();
		
	//private static EmployeeService employeeservice;
	
	//public static EmployeeService getInstance()
	
	//{
	//public static EmployeeServiceImpl.getInstance() {
		//if(employeeservice == null) {
			
			//employeeservice = new EmployeeServiceImpl();
			//return employeeservice;
			
		//}
		//return employeeservice;
		
	//}
					
		/*public String.addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee;)
		}
		public Employee getEmployee(String Id) {
			return employeeRepository.getEmployee(Id);
		}
		public Employee[] getEmployeees() {
			return employeeRepository.getEmployees();
		}*/
	
		
	
   
	
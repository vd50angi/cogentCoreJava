package com.cogent.EmployeeManagementSystem.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;


public class EmployeeRepositoryALImpl   implements EmployeeRepository {

		
	//singleton DP(default parameter)
		private static EmployeeRepository employeeRepository;
		private EmployeeRepositoryALImpl() {
			
			
		}
		public static EmployeeRepository getInstance() {
			if(employeeRepository==null) {
				employeeRepository= new EmployeeRepositoryALImpl();
				return employeeRepository;
			}
			return employeeRepository;
		}
		
		private Set<Employee> employees = new HashSet<>();
		
		//16 employees
		//when we will add 11th one then it will increase the size automatically
		// self growable
		//<Employee>===> we are informing what we will hold only employee type objects.
		@Override
		public String addEmployee(Employee employee) {
			// TODO Auto-generated method stub
			boolean status= employees.add(employee);
			if(status) {

			return "success";}
			else return "fail";
		}

		@Override
		public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
			
			Employee employee= this.getEmployeeByID(id);
			if(employee!=null) {
				if(employees.remove(employee)){
					return "success";
				}
				
			}return "the object is null";

		
		}

		@Override
		public void deleteAllEmployees() {
			// TODO Auto-generated method stub
	employees.clear();
		}

		@Override
		public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException {
			// TODO Auto-generated method stub
			//1. we need to traverse the arraylist
			for (Employee employee : employees) {
				if(employee!=null && id.equals(employee.getEmployeeID()))
					return employee;
				
			}
			
			//2. we need to use java 8 feature
			return null;
		}

		@Override
		public List<Employee> getEmployees() {
			//AL==> array
			//Employee[] employee= new Employee[employees.size()];
			//set==>list.
			return new ArrayList<>(employees);
		}

		@Override
		public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean isEmployeeExist(String Id) {
			// TODO Auto-generated method stub
			for (Employee employee : employees) {
				if(Id.equals(employee.getEmployeeID())) {
					return true;
				}
			}
			return false;
		}

	}
	
	
	//**********************
	
	
	
	
	
	
	
	
	/*
	
	// Singleton DP.
	private static EmployeeRepository employeeRepository;

		private EmployeeRepositoryALImpl() {
			// TODO Auto-generated constructor stub
		}

		public static EmployeeRepository getInstance() {// Singleton DP.
			private static EmployeeRepository employeeRepository;

			private EmployeeRepositoryALImpl() {
				// TODO Auto-generated constructor stub
			}

			public static EmployeeRepository getInstance() {

				if(employeeRepository==null) {
					employeeRepository = new EmployeeRepositoryALImpl();
					return employeeRepository;
				}
				return employeeRepository;

			}

			private List<Employee> employees = new ArrayList<>();
			// 10 employees 
			// when we will add 11th one then it will increase the size automatically.
			// self growable.

			// <Employee>  ====> we are informing that we will hold only Employee type objects.


			if(employeeRepository==null) {
				employeeRepository = new EmployeeRepositoryALImpl();
				return employeeRepository;
			}
			return employeeRepository;

		}

		//private List<Employee> employees = new ArrayList<>();// prefer  used in searching clarity
		//private List<Employee> employees = new LinkedList<>(); //
		//private Set<Employee> employees = new HashSet<>(); 
		//private List<Employee> employees = new ArrayList<>();
		
		private Set<Employee> employee = new HashSet<>(); 
		
		// 16employees 
		// when we will add 11th one then it will increase the size automatically.
		// self growable.

		// <Employee>  ====> we are informing that we will hold only Employee type objects.

		@Override
		public String addEmployee(Employee employee) {
			// TODO Auto-generated method stub

			//boolean status = employees.add(employee);

			boolean status = employee.remove(employee);
			
			if(status)

			return "success";
			else 
				return "fail";
		}

		
		@Override
		public void deleteAllEmployees() {
			// TODO Auto-generated method stub

		}

		@Override
		public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
			// TODO Auto-generated method stub

			// 1. we need to traverse the arraylist.

			for (Employee employee : employee) {
				if(id.equals(employee.getEmployeeId()))
					return employee;
				//System.out.println(employee);
			}
			// 2. we need to use java 8 features.

			return null;
		}

		@Override
		public List<Employee> getEmployees() {
			// TODO Auto-generated method stub
			// AL => array 
			//Employee employee[] = new Employee[employees.size()];
			return employee;
		}

		@Override
		public String updateEmployee(String id, Employee employee) {
			// TODO Auto-generated method stub
			return null;
		}

	}
		//@Override
		
		//public boolean isEmployeeExists(String id) {
			
			
			//for(Employee employee : employees) {
				//if(id.equals(employee.getEmployeeId())) {
				//	return true; 
				//}
			//}
						
			//return false;
		//}
		
		*/
	
	//***********************//old code
//Singeleton DP
	
	//private static EmployeeRepositoryALImpl employeeRepository;// used to create singleton class
	//
	//private static EmployeeRepository employeeRepository;
	
	//private EmployeeRepositoryALImpl() {
	// private constructor/ only one private constructor
	//}
  
	
	//public static EmployeeRepositoryALImpl getInstance() {
	
	//	if(employeeRepository ==null) {
		 //  employeeRepository = new EmployeeRepositoryALImpl(); //create an object
		 //  return employeeRepository;  //return method
	//}
	
	//	return employeeRepository; // only one object on this method
//}
	
		
	//private ArrayList<Employee> employees = new ArrayList<>();
	//10 employees
	//when  will add 11th one then it will increaase size automatically
	//self growable
	
	
	//@Override
	//public String addEmployee(Employee employee) {
		
		//boolean status = employees.add(employee);
		
		//if(status)
			//return "success";
		//else
			
			//return "fail";
		
		//public int getIndex(String id) {
		
		
	//}
	
  //@Override 
  //public Employee getEmployeeById(String id) throws IdNotFoundException,IOException {
	
	////1. we need to traverse the arraylist
	
	//for (Employee employee : employees) {
		//if(employee.getEmployeeId().equals(Id))
		//{
		//	return employee;
		//}
		
	//} 
			
			//return null;
	
		//}
			
	//2.  we need to use java 8 features
	
//@Override
  
      //public String addEmployee(Employee employee) {
		
		//return employeeRepository.addEmployee(employee);
  
//}

      //private List<Employee>



  //	@Override	
	
	//public List<Employee> getEmployees() {
	//return employeeRepository.getEmployees();
		//Employee employee[] = new Employee[employees.size()];    //.size it will give size to an array
		
		//return employees.toArray(employee); // will be taken care of two array method
  		
  		//return employees;
  		
  	//	return null;
	//}
	
  	//@Override
  	//public getEmployeeById(String Id) throws IdNotFoundException, IOException {
  		
  		//for(Employee employee : employee) {
  		//	if(employee.getEmployeeId().equals(Id))
  			//{
        	
  			//	  return employee;
  	  //	}
//}

//return null;

//}
  	
  	//@Override
  	//public String updateEmployee(String employeeId, Employee employee) throws IdNotFoundException, IOException {
  	//
  	//	return null;
  		
  	//}
  	
  // @Override
   //public String deleteEmployeeById(String Id) throws IdNotFoundException, IOException { 
	  // return  employeeRepository.deleteEmployeeById(Id);
	  // Employee employee = this.getEmployeeById(id);
	   
	  // if(employee!=null) {
		//   boolean status = employees.remove(employee);
		//   if(status) {
		//	   return "success";
		//   }
		   
	  // }
	  // return "notFound";
	   //return null;
   //}
   
   //@Override//current
   //public void deleteAllEmployee() {
	   //delete all empl from array list
	 //  employees.clear();
	   
	   
   //}
	 
	   //return  employeeRepository.deleteAllEmployees();
	  // employeeRepository.deleteAllEmployees();
   //}
	
   
	
//}


//@Override
	//public Employee[] getEmployeeByName(String name) {
		//return employeeRepository.getEmployeeByName(name);
	//	return employeeRepository.getEmployees();
	





/*@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean status = employee.add(employee);
		if(status)
		{
			return "success";
		}
		else
			return "failed";
 *  */



/* Sir ABis code
 * package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {

	// Singleton DP.
private static EmployeeRepository employeeRepository;

	private EmployeeRepositoryALImpl() {
		// TODO Auto-generated constructor stub
	}

	public static EmployeeRepository getInstance() {

		if(employeeRepository==null) {
			employeeRepository = new EmployeeRepositoryALImpl();
			return employeeRepository;
		}
		return employeeRepository;

	}

	private List<Employee> employees = new ArrayList<>();
	// 10 employees 
	// when we will add 11th one then it will increase the size automatically.
	// self growable.

	// <Employee>  ====> we are informing that we will hold only Employee type objects.

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub

		boolean status = employees.add(employee);

		if(status)

		return "success";
		else 
			return "fail";
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub

		// 1. we need to traverse the arraylist.

		for (Employee employee : employees) {
			if(id.equals(employee.getEmployeeId()))
				return employee;
			//System.out.println(employee);
		}
		// 2. we need to use java 8 features.

		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		// AL => array 
		//Employee employee[] = new Employee[employees.size()];
		return employees;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
 * 
 * */

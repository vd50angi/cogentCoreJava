package com.cogent.EmployeeManagementSystem.repository;

import java.io.IOException;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;

import com.cogent.EmployeeManagementSystem.model.Employee;


 public class EmployeeRepositoryImpl implements EmployeeRepository {

	 private Employee[] employees = new Employee[10];
		int counter= -1;
		private static EmployeeRepository employeeRepository;
		private EmployeeRepositoryImpl() {
			
			
		}
		public static EmployeeRepository getInstance() {
			if(employeeRepository==null) {
				employeeRepository= new EmployeeRepositoryImpl();
				return employeeRepository;
			}
			return employeeRepository;
		}
		public String addEmployee(Employee employee) {
			if(counter>employees.length) {
				return "the array is full";
			}
			employees[++counter]= employee;
			return "success!";
		}
		public Employee getEmployeeByID(String id) throws IdNotFoundException, IOException {
			//to throw the checked exception to the caller
			
			for(Employee employee: employees) {
				if( employee!=null && id.equals(employee.getEmployeeID())) {
					
					return employee;
				}
				throw new IOException();
				
			}
			
			throw new IdNotFoundException("Id not found");
			// it will throw the exception
		}
		public Employee[] getEmployees() {
			return employees;
			
		}
		public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
	Employee employee= this.getEmployeeByID(id);
	 if(employee !=null) {
		 System.out.println("we found it and try to delete it");
		if(this.getIndex(employee)!=-1) {
		 employees[this.getIndex(employee)]=null;
		return "we already deleted it";}
		else {
			return "not found";
		}
	 }else {
			 return "not found";
	 }
		}
	 private int getIndex(Employee employee) {
		 for(int i=0; i<employees.length;i++) {
			 if(employees[i].equals(employee)) {
				 return i;
			 }
			 
		 }
		 return -1;
	 }
	@Override
	public void deleteAllEmployees() {
		for(int i=0; i<employees.length; i++) {
			employees[i]=null;
		}
		
	}

	@Override
	public String upddateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		Employee temp= this.getEmployeeByID(id);
		if(temp != null) {
		employees[this.getIndex(temp)]=employee;	
			return "already updated!";
		}
		else {
		return "not found";	
		}
		
	}
	public Employee getEmployeeByName(String name) {
		for(int i=0; i<employees.length; i++) {
			if(
			name==employees[i].getFirstName()+employees[i].getLastName()) {
				return employees[i];
			}
		}
		return null;
	}

	@Override
	public boolean isEmployeeExist(String Id) {
		// TODO Auto-generated method stub
		return false;
	}
		}
	 
	 
	 
	 
	 
	 /*public String addEmployee(Employee employee) {
		}

		// this method should give us employee details on the basis of id
		public Employee getEmployeeById(String id) {
		public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
			// to throw the checked exception to the caller

			for (Employee employee : employee) {

				if(employee!=null && id.equals(employee.getEmployeeId())  ) {

					//throw new IOException();
					return employee;
				}
			}
			return null;

			throw new IdNotFoundException("id not found");
			// it will throw the exception 


		}

		public Employee[] getEmployees() {
			return employee;
		}

		public String deleteEmployeeById(String id) {
		public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {

			// 1 that id exists or not.
			Employee employee = this.getEmployeeById(id);
			
			@Override
			public String deleteEmployeeById(String Id) throws IdNotFound Exception, IOException {
				
				Employee employee = this.getEmployeeById(Id);
				
				if(employee!= null)
				{
					int index = this.getIndex(employee);
					
					
					if(index!=-1)
					{
						employee[index] = null;
						return "success";
					}
					else
					{
						return "not found";
					}
				}
				else
				{
					return " not found";
				}
			}
			
			private int getIndex( Employee employee) {
				for (int i = 0; i < employee.length; i++)
				{
					if(employee[i].equals(employee))
					
					{
						
						return i;
				
					}
				}
				return -1;
			}
						
			
	@Override
			public void deleteAllEmployee() {
						
				employee = null;
	
		}			
						
	}				
				
			
			
	 
	 
	 
	 
	 //public String addEmployee(Employee employee) {
	 
	//private Employee[] employee = new Employee[10];
	//private static EmployeeRepository productRepository;
	
	//private EmployeeRepositoryImpl() {
		// private constructor/ only one private constructor
	//	}
	
	//private static EmployeeRepositoryImpl employeeRepository;// used to create singleton class
	
		
	//public static EmployeeRepositoryImpl getInstance() {
		//if(employeeRepository ==null) {
		//	employeeRepository = new EmployeeRepositoryImpl(); //create an object
		//	return employeeRepository;  //return method
		//}
		//return employeeRepository; // only one object on this method
	//}
		 
	
	//static int counter = 0;// static creates one single copy in memory
		//public String addEmployee(Employee employee) {
		
	//add employee	
	//public String addEmployee(Employee employee) {
		 
		// if(counter>=employees.length) { // example of length method
			//return "array is full"; //
		//}
		
		// employees[counter++] = employee;
		//return "done";
		//return"success";
//}
	//@Override
	
	//public String updateEmployee(String employeeId, Employee employee) throws IdNotFoundException,IOException {
		//Employee employee1 = this.getEmployeeById(employeeId);
		//if(employee2!==null)
			
		//{
		//	int index = this.getIndex(employee1)
					
		//if(index!=1)
		//{
		//	employee[index]= employee;
		//	return "success";
		//}
		//   else
		 //  {
		
	     //  return "not found";
	//}
	 // }
		
		//else
			// return "not found";
		
	//}
 						// this method should give us employee details on the basis of id
	
			*/
			
			//**********************  same as code above but theres additional .. the old one
	// public employee getEmployeeById(String id) {	
	//public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
			
		// to throw the checked exception to the caller who is the caller Service
     
		  // for (Employee employee:employee) {
			
			// if( employee!=null &&id.equals(employee.getEmployeeId()) ) {
				
				//throw new IOException();
								
				//return employee;
			 		//}
		
        // throw new IdNotFoundException ("id not found"); // it will throw exception
		//apply on #1 pointers  of exception diagram / will throw exception 
	//return null;
         
	//}
	
		//@Override
		//public Employee[] getEmployee() {
		//return employee;
	//}
	
	
	@Override
	//public String addEmployee(Employee employee) {
		
		//boolean status = employee.add(employee);
		
		//if(status)
		//	return "success";
		//else
			
			//return "fail";
	//}
	
		
							
			//@Override
			//public String deleteEmployeeById(String Id) throws IdNotFound Exception, IOException {
				
			//	Employee employee = this.getEmployeeById(Id);
				
			//	if(employee!= null)
			//	{
			//		int index = this.getIndex(employee);
					
					
				//	if(index!=-1)
				//	{
					//	employee[index] = null;
					//	return "success";
					//}
					//else
					//{
					//	return "not found";
					//}
				//}
				//else
				//{
				//	return " not found";
				//}
			//}
			
			//private int getIndex( Employee employee) {
				//for (int i = 0; i < employee.length; i++)
				//{
					//if(employee[i].equals(employee))
					
					//{
						
						//return i;
				
					//}
				//}
				//return -1;
			//}
						
			
	//@Override
			//public void deleteAllEmployee() {
						
				//employee = null;
	
		//}			
						
	//}				
						
				
					
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//@Override //deleteAllEmployees
			
		//	public String  deleteEmployeeById(String id) {
				// TODO Auto-generated method stub
				//employees = null;
				//return employeeRepository.deleteEmployeeById1(id);
				
				
			
		//	@Override //update employees
			//public String updateEmployee(String id, Employee employee) {
				
			//	Employee employee1 = new Employee();
			//	employee1.setFirstName("Angi");
			 //   employee1.setAddress("");
			    //Object update;
				//(update (employee1);
				// TODO Auto-generated method stub
			//	return id;
				
			//}
							
			
			//private static int index = 0;
			// search employee basis by name
		// public Employee getEmployeesById(String name) {
			
		//	 Employee[] employeeTemp = new Employee[employees.length];
			 
			// for(Employee employee : employees) {
			//	   if(employee.getFirstName().equals(name)) {
						//  employeesTemp [index++] = employee;
				//	  }
				//  }
				//  return null;
			 // }
			//}
				
			                                                                                             


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
		
	

				//	@Override
					//public String deleteEmployeeById1(String id) throws IdNotFoundException, IOException {
						//1 that id exist or not
						
					//	Employee employee = this.getEmployeeById(id);
						
					//	if(employee!=null ) {
								
					//	int index = this.getIndex(employee);// this refers to current object
						
					//	if( index!=-1) {
							//record found
						//	employee[index] = null;
						//	return "Success";
							
						//} 
						
						//else 
						
					//	{
						//	return "not found";
					//		
					//}		
						//if employee is in the array it should return -1*/
					//	}
						 
					//	else
					//		
						{
					//	return "not found";
					//}
				// }	
					
					//private int getIndex(Employee employee) {		
								
					//	for (int i = 0; i <employees.length; i++) {
									
						//			if(employees[i].equals(employee)) {
						//				
							//			return i;
							//		}
							//	}
								
							//	return -1;
									
					//}
							
	
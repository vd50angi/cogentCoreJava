package com.cogent.EmployeeManagementSystem.model;

//import java.util.Objects;

import com.cogent.EmployeeManagementSystem.exception.InvalidSalaryException;
//import com.cogent.EmployeeManagementSystem.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
  public  class Employee {
	  //implements Comparable<Employee>
	  {

	  	
	  	 @Override
	  	 public int hashCode() { return Objects.hash(EmployeeID, address,
	  	 department, empSalary, firstName, lastName); }
	  	 
	  	@Override
	  	public boolean equals(Object obj) {
	  		if (this == obj)
	  			return true;
	  		if (obj == null)
	  			return false;
	  		if (getClass() != obj.getClass())
	  			return false;
	  		Employee other = (Employee) obj;
	  		return Objects.equals(EmployeeID, other.EmployeeID) && Objects.equals(address, other.address)
	  				&& Objects.equals(department, other.department)
	  				&& Float.floatToIntBits(empSalary) == Float.floatToIntBits(other.empSalary)
	  				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	  	}

	  	public float calculateSalary() {

	  		return empSalary + 500;
	  	}

	  	public Employee(String employeeID, String firstName, String lastName, float empSalary, String address)
	  			throws InvalidSalaryExcception {
	  		super();
	  		EmployeeID = employeeID;
	  		this.firstName = firstName;
	  		this.lastName = lastName;
	  		this.setEmpSalary(empSalary);
	  		this.address = address;

	  	}

	  	private String EmployeeID;
	  	private String firstName;
	  	private String lastName;
	  	private float empSalary;
	  	private String address;
	  	private String department;

	  	public Employee() {
	  		System.out.println("welcome employee constructor");
	  	}

	  	public String getEmployeeID() {
	  		return EmployeeID;
	  	}

	  	public void setEmployeeID(String employeeID) {
	  		EmployeeID = employeeID;
	  	}

	  	public String getFirstName() {
	  		return firstName;
	  	}

	  	public void setFirstName(String firstName) {
	  		this.firstName = firstName;
	  	}

	  	public String getLastName() {
	  		return lastName;
	  	}

	  	public void setLastName(String lastName) {
	  		this.lastName = lastName;
	  	}

	  	public float getEmpSalary() {
	  		return empSalary;
	  	}

	  	public void setEmpSalary(float empSalary) throws InvalidSalaryExcception {
	  		// Salary is not negative
	  		// if it is negative invalidsalaryexception

	  		if (empSalary > 0)
	  			this.empSalary = empSalary;
	  		else
	  			throw new InvalidSalaryExcception("wrong salary set");
	  		// runtime exception is unchecked exception , so dont need throws key word
	  		// InvalidSalaryException is extend Runtime exception
	  		// but we still can use throws
	  	}

	  	public String getAddress() {
	  		return address;
	  	}

	  	public void setAddress(String address) {
	  		this.address = address;
	  	}

	  	public String getDepartment() {
	  		return department;
	  	}

	  	public void setDepartment(String department) {
	  		this.department = department;
	  	}

	  	@Override
	  	public String toString() {
	  		return "ID: " + EmployeeID + " FirstName: " + firstName + " LastName: " + lastName + " EmpSarlary " + empSalary
	  				+ " Adress: " + address;
	  	}

	  	@Override
	  	public int compareTo(Employee o) {
	  		// TODO Auto-generated method stub
	  		
	  		return this.EmployeeID.compareTo(o.EmployeeID);
	  	}

	  }


	/*public float calculateSalary() {
		return employeeSalary + 500;
	}
  
	//public void setLastName(String lastName) {
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	
	
	public void setEmployeeSalary(float employeeSalary) {
	public void setEmployeeSalary(float employeeSalary) throws InvalidSalaryException{
		// salary is not negative RT
		// if it is negative invalidsalaryException
		
		if(employeeSalary>0)
		this.empployeeSalary = employeeSalary;
		else
			
			
			throw new InvalidSalaryException("salary should not be negative");
	}
	
	
	
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Employee(String employeeId, String firstName, String lastName, float empSalary) {
	
	public Employee(String employeeId, String firstName, String lastName, float empSalary) throws InvalidSalaryException {
				
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;
		this.setEmpSalary(empSalary);
	}
	
		private String employeeId;
	private String firstName;

	
	   }
	}
  
  }
  */




//*********************
//@Data  // **old code
//@AllArgsConstructor
//@ToString
//
///public final class Employee {
	
	//public  float calculateSalary() {
	// return empSalary + 500; // 500 is the bonus salary method 
		// add calculate salary method here to calculate salary 
		
	// public void setLastName(String lastName) {
			//public float getEmpSalary() {
			//	return empSalary;
		//	}
						
		//@Override
			//public int hashCode1() {
			//return 5000;
			//}
			
		//	@Override
		//	public int hashCode() { //consistent return same  value output
			//	return Objects.hash(address, empSalary, employeeId, firstName, lastName);
			//}
								
			//@Override ex. part of hashcode implement
			//public static int hashCode(Object a[]) {
				
			//if (a == null)
					
					//return 0;
				
				//int result = 1;
				
				//for (Object element :a)
					
					//result = (31 * result + (element == null? 0: element)
					
					
			//why 31? its a prime number
			//why prime  number?becoz multiplication 
			//with prime will help generate a unique number
		 // a prime multiplied by prime is always prime
			
			//}
								
			//@Override
			//public boolean equals(Object obj) {
			//	if (this == obj)//reflexive condition
			//		return true;
			//	if (obj == null)
			//		return false;
			//	if (getClass() != obj.getClass())
				//	return false;
			//	Employee other = (Employee) obj;
			//	return Objects.equals(address, other.address)
						//&& Float.floatToIntBits(empSalary) == Float.floatToIntBits(other.empSalary)
						//&& Objects.equals(employeeId, other.employeeId) && Objects.equals(firstName, other.firstName)
						//&& Objects.equals(lastName, other.lastName);
			//}
			//public void setEmpSalary(float empSalary) {
			//public void setEmpSalary(float empSalary) throws InvalidSalaryException{
				// salary is not negative RT
				// if it is negative invalidsalaryException
				//if(empSalary>0)
				//this.empSalary = empSalary;
				//else
					//throw new InvalidSalaryException("salary should not be negative");
			//}
			//public String getAddress() {
				//return address;
			//}
			//public void setAddress(String address) {
				//this.address = address;
			//}
			//public Employee(String employeeId, String firstName, String lastName, float empSalary) {
			//public Employee(String employeeId, String firstName, String lastName, float empSalary) throws InvalidSalaryException {
				//super();
				//this.employeeId = employeeId;
				//this.firstName = firstName;
				//this.lastName = lastName;
				//this.empSalary = empSalary;
				//this.setEmpSalary(empSalary);
			//}
			//private String employeeId;
			//private String firstName;
			//private String lastName;
			//private float empSalary;
			//private String address;
			//public Employee() {
				
				//this.employeeId="";
				
				//System.out.println("hello from default constructor");
				//explicit default constructor
			//}
			  // }

	
			
			// add calculate salary method here to calculate salary 
				
		
			
			//public static EmployeeService getInstance() {
				// TODO Auto-generated method stub
			//	return null;
		
			
	 
	 
	 
	 
	 

					
	/*************old  code
	public String getEmployeeId() {
	return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getEmpSalary() {
		return empSalary;
					
	}
	//public void setEmpSalary(float empSalary)  {
	//	this.empSalary = empSalary;
	//salary si not negative becaus eits run time
	
	public void setEmpSalary(float empSalary)throws InvalidSalaryException {
		// salary is not negative
		// if it negative invalid salaryException
		if(empSalary>0)
		this.address.empSalary = empSalary;
		else
			 throw new InvalidSalaryException("salary shoild not be negative");
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		public Employee(String employeeId, String firstName, String lastName, float empSalary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.setEmpSalary(empSalary);
		
	}
		private String employeeId;
		private String firstName;
		private String lastName;
		private float empSalary;
		private String address;
		public Employee() {
			this.employeeId="";
			System.out.println("hello from default constructor");
			//explicit default constructor
			
		
		// add calculate salary method here to calculate salary 
			
	
	
		}


		//public static EmployeeService getInstance() {
			// TODO Auto-generated method stub
		//	return null;
		}*/
 

	/* Sir abhi s code complete
	 * package com.cogent.employeemanagementsystem.model;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public  class Employee {



	public float calculateSalary() {
		return empSalary + 500;
	}
@@ -32,21 +36,26 @@ public void setLastName(String lastName) {
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
	public void setEmpSalary(float empSalary) throws InvalidSalaryException{
		// salary is not negative RT
		// if it is negative invalidsalaryException
		if(empSalary>0)
		this.empSalary = empSalary;
		else
			throw new InvalidSalaryException("salary should not be negative");
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(String employeeId, String firstName, String lastName, float empSalary) {
	public Employee(String employeeId, String firstName, String lastName, float empSalary) throws InvalidSalaryException {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;
		this.setEmpSalary(empSalary);
	}
	private String employeeId;
	private String firstName;
	 * 
	 * 
	 * 
	 * 
	 */
















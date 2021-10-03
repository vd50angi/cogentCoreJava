package com.cogent.EmployeeManagementSystem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.cogent.EmployeeManagementSystem.InvalidSalaryException;
import com.cogent.EmployeeManagementSystem.model.Employee;


public class MainHashCode {
	
	
	public static void main(String[] args) {
		
	
		Employee employee=null;
		Employee employee2=null;
		Employee employee3=null;
		
			try {
				employee = new Employee("An0001","Angie","DeVega",100.0f,"VA");
			} catch (InvalidSalaryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				employee2 = new Employee("An0001","Angie","DeVega",100.0f,"VA");
			} catch (InvalidSalaryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				employee3 = new Employee("AN0003","Angie","DeVega",10000.0f,"VA");
			} catch (InvalidSalaryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		System.out.println(Integer.toHexString(employee.hashCode()));
		System.out.println(Integer.toHexString(employee2.hashCode()));
		System.out.println(Integer.toHexString(employee3.hashCode()));
				
				Set<Employee> employees=new LinkedHashSet<>();
				
				employees.add(employee);
				employees.add(employee2);
				employees.add(employee3);
				
				for (Employee employee4 : employees) {
					System.out.println(employee4);
				}
					
				
		
		
		
	}
	}
	


}

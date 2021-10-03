package com.cogent.EmployeeManagementSystem.service;

import java.io.IOException;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.service.EmployeeServiceImpl;
import com.cogent.EmployeeManagementSystem.service.EmployeeService;

public class Main2 {
	
	  public static void main(String[]args) throws  IdNotFoundException, IOException{
		  
		  EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		  Employee employee = employeeService.getEmployeeById("abd2234");
		  //will terminate execution because it went from checked excep to unchecked excep
		  
		 try {
			 Employee employee = employeeService.getEmployeeImpl.get
		} catch (IdNotFoundException e) {
			// TODO: handle exception
		} catch(IOException e) {
		}
	  }
	
	

}

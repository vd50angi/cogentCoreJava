package com.cogent.EmployeeManagementSystem.exception;


import lombok.ToString;

@ToString

public class InvalidSalaryException extends RuntimeException {
	
	public InvalidSalaryException(String message)  {

   super(message);
	
	}
	
}




package com.cogent.EmployeeManagementSystem.exception;
	
	import lombok.ToString;
	
	@ToString
	
	
	public class IdNotFoundException extends Exception { //checked exception
		
      public IdNotFoundException(String message) {
    	  // constructor stub
	
    	  super(message); // call the base class constructor
}
	
}

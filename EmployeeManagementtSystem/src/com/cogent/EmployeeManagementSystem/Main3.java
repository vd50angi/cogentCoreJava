package com.cogent.EmployeeManagementSystem;

import com.cogent.EmployeeManagementSystem.model.Employee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class Main3 {
	
	//link for the code ==>https://codeshare.io/oQ0L7M

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = null;
		try {
			employee = new Employee("ab001","abhi","chivate",1000.0f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(employee.hashCode());

		Employee employee2 = null;
		try {
			employee2 = new Employee("ad001","advik","chivate",10000.0f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				;
		Employee employee3 = null;
		try {
			employee3 = new Employee("ab002","abhi","",1000000.0f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//System.out.println(employee2.hashCode());
		
		System.out.println(Integer.toHexString( employee.hashCode()));
		System.out.println(Integer.toHexString( employee2.hashCode()));
		System.out.println(Integer.toHexString( employee3.hashCode()));
		
		Set<Employee> employees = new LinkedHashSet<>();
		
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		for (Employee employee4 : employees) {
			System.out.println(employee4);
		}
		

	}

}

	
	
	
	// **************************************************** study --/old code/study the notes
//public static void main(String[]args) {
	
	//Employee employee = new Employee("ang011", "anghie", "deve",1000.0f);
	
	//System.out.println(employee.hashCode());
	
		//	Employee employee2 = new Employee();
		///	
	      //  Employee employee3 = new Employee();
			
			//System.out.println(employee2.hashCode());//refle
			
	        //Employee employee2;
	        
	        
	       // try {
			//	employee2 = newEmployee("ang001","anghie", "deve",)
	        	
	        	        	
			//} catch (InvalidSalaryException e) {
				// TODO: handle exception
				
			//	e.printStackTree();
				
			//}
	        
	       // Employee employee3;
	        
	       // try {
				//employee3 = newEmployee("ang001", "anghie","deve")
	        	
	        	        	
			//} catch (InvalidSalaryException e) {
				// TODO: handle exception
				
			//	e.printStackTree();
				
			//}
	        
	        
	        
	        
			//System.out.println(employee.equals(employee2));//will print our true //symmetric
	
	       //System.out.println(employee2.equals(employee3));//will print true
	
            // System.out.println(employee3.equals("ang001"));// transitive all 3 are equal true 
               //consistent -- all true
             
            // System.out.println(employee.equals(null));
         	
  	        // System.out.println(employee2.equals(null));
  	
             //  System.out.println(employee3.equals(null)); //consistent false all 3
         
               //***implement hashcode contract//check documentation
         
			     //  System.out.println(Integer.toHexString(Employee.hashCode()));
			     ///  System.out.println(Integer.toHexString(Employee2.hashCode()));
			     //  System.out.println(Integer.toHexString(Employee3.hashCode()));
			       
			       
			
			
			
             //  System.out.println(employee.hashCode());
            ///	
    	        // System.out.println(employee2.hashCode());
    	//
                // System.out.println(employee3.hashCode()); 
           
               
                 //System.out.println("abhi".equals(2500));//not equals same string but different int value
               
            }

    //   Set<Employee> employees = new HashSet<>();

    //     employees.add(employee);
     //   employees.add(employee2);
    //    employees.add(employee3);
   //
    //   for(Employee4 : employees) {
	   
	//   System.out.println(employee4) //note dont for get to uncomment hashcode and equals to employee class to get result
 //  }

       
//}



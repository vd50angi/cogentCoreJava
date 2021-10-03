
package com.cogent.EmployeeManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.service.EmployeeService;


public class Main {

	//public static void main(String[] args) {

		public static int division(int a, int b) {
			int c = 0;
			try {
				c = a / b; // it will create am object of arithmetic exception
				// JVM will implicitly create the objects for all per defined runtime exception
				return c; // if division is done then return the result.
			} catch (ArithmeticException e) {
				// TODO: handle exception

			} finally {
				System.out.println("finally");// finally blocpublic static void main(String[] args) {
			
						
				  
			}
			return -1;
		}

		
		public static void main(String[] args) {
			
			
			
		  EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		
		
		}
}
	
		
		
		// can u write a switch case  to handle all options?
//		1. add
//		2. getEmp by id
//		3. delete
//		4. update assignment
//		5. getall
//		6. exit
		//EmployeeService employeeService = new EmployeeService();

		//Employee employee = new Employee("an001", "angie", "dvg", 123.0f, "VA");

		//String result = employeeService.addEmployee(employee);

		//System.out.println(result);

		//Employee[] employees = employeeService.getEmployees();

		//for (Employee employee2 : employees) {
			//System.out.println(employee2);
		//}
		//Employee employee = new Employee("an001", "angie", "dvg", 123.00f);
		//employee.setEmpSalary(-5000.0f);
//		
		
	}
	
}
		
//		try {
//			FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
//			fileOutputStream.write("abc".getBytes());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	//}



//	public static int division(int a, int b) {
//		
//		int c = 0;
//		try {
//			c = a / b; // it will create an object of arithmetic exception.
//			// JVM will implicitly create the objects for all pre defined runtime exceptions.
//			
//			return c ; // if division is done then return the result.
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
//		
//		}
//		
////		finally {
////			System.out.println("inside the finally block"); // finally block code 
////			
////		}
//		
//		return -1;
//		
//	}
//	
//
//	public static void main(String[] args) {
//		
//		try { // 10 statements 
//			System.out.println(10/5);
//			String s = null;
//			System.out.println(s.concat("abhi")); // s is holding that means 
//			// s is not refering to object 
//			// to call concat method we need object
//			// since object is not there and we are trying to call concat method 
//			// then it will throw NPE.
//			
//		} // extreme child to top parent.
//		
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
//		}
//		catch (RuntimeException e) {
//			// TODO: handle exception
//		}
//		
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("exception caught");
//			System.out.println(e.getClass().getName());
//		}
//		catch (Throwable e) {
//			// TODO: handle exception
//		}
//		

     // Why no for object if object is able to handle it then everyclass is capable to 
//		// handle the exception 
//		// then what is diff between a normal class and exceptional class?
//		
////		catch (Object e) {
////			// TODO: handle exception
////		}
//		
//		
//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//*************old code
		
		
		// can u write a switch case  to handle all options?
//		1. add
//		2. getEmp by id
//		3. delete
//		4. update assignment
//		5. getall
//		6. exit
		//EmployeeService employeeService = new EmployeeService();

		//Employee employee = new Employee("ab001", "abhi", "chivate", 123.0f, "PA");

		//String result = employeeService.addEmployee(employee);

		//System.out.println(result);

		//Employee[] employees = employeeService.getEmployees();

		//for (Employee employee2 : employees) {
		//	System.out.println(employee2);
		//}
		//Employee employee = new Employee("ab001", "abhi", "chivate", 123.00f);
		//employee.setEmpSalary(-5000.0f);
//		
//		try {
//			FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
//			fileOutputStream.write("abc".getBytes());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	

//************************
	
	//package wrapperDemo;

	//import java.util.Collection;
	//import java.util.HashMap;
	//import java.util.LinkedHashMap;
	//import java.util.LinkedHashSet;
	//import java.util.List;
	//import java.util.Map.Entry;
	//import java.util.Set;

	//public class Main {

		//public static void main(String[] args) {
			
			//LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
			
			//hashMap.put(10, "abhi");
			//hashMap.put(null, "abhinandan");
			//hashMap.put(null, null);
			
			
			//System.out.println(hashMap.get(10));
			
			// traverse the map 
			
			//for (Entry<Integer, String> entry : hashMap.entrySet()) {
				//  entry ===> key value pair
				
				//Integer key = entry.getKey();
				//String val = entry.getValue();

				//System.out.println("key="+key);
				//System.out.println(val);
				
			//}
			
			
		//}
	//}

	
	
	
	
	
	
	
	
	
	//*****************************

//	public static int division(int a, int b) {
//		
//		int c = 0;
//		try {
//			c = a / b; // it will create an object of arithmetic exception.
//			// JVM will implicitly create the objects for all pre defined runtime exceptions.
//			
//			return c ; // if division is done then return the result.
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
//		
//		}
//		
////		finally {
////			System.out.println("inside the finally block"); // finally block code 
////			
////		}
//		
//		return -1;
//		
//	}
//	
//
//	public static void main(String[] args) {
//		
//		try { // 10 statements 
//			System.out.println(10/5);
//			String s = null;
//			System.out.println(s.concat("abhi")); // s is holding that means 
//			// s is not refering to object 
//			// to call concat method we need object
//			// since object is not there and we are trying to call concat method 
//			// then it will throw NPE.
//			
//		} // extreme child to top parent.
//		
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
//		}
//		catch (RuntimeException e) {
//			// TODO: handle exception
//		}
//		
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("exception caught");
//			System.out.println(e.getClass().getName());
//		}
//		catch (Throwable e) {
//			// TODO: handle exception
//		}
//		// Why no for object if object is able to handle it then everyclass is capable to 
//		// handle the exception 
//		// then what is diff between a normal class and exceptional class?
//		
////		catch (Object e) {
////			// TODO: handle exception
////		}
//		
//		
//}

	//*****************
	
	
	
	
	//public static void main(String[]args) throws InvalidSalaryException, IOException {
		//Employee employee = new Employee("angie334", "angie","devega", 1232.00f);
		//employee.setEmpSalary(-500.0f);
		
		  //EmployeeService employeeService =EmployeeServiceImpl//.getInstance();
		//EmployeeService service = new EmployeeServiceImpl();	
			
		//String result = null;
		
		//  try {
			//  result = employee.addEmployee(new Employee("ad001", "angi", "deveg", 123.00f));
			  
		//} 
		//  catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
			
		//if("success".equals(result))
		//{
		//	System.out.println("employee added successfully");
	//	}
		
	//  try {
	//	System.out.println(service.getEmployeeById("ad"));
		
	//} catch (InvalidEmployeeException e) {
		// TODO: handle exception
	//	e.printStackTrace();
	//}
	  
	//}
	//	
	//}	
			
		

		/*EmployeeService service = Employee.getInstance();
		
		Employee employee = new Empployee("001"), "Angie", "Deveg", 1000.0f, "VA");
		
		String result = service.addEmployee(employee);
		
		System.out.println(result);*/
		
		
		//Scanner scanner = new Scanner(System.in);
		
		//it is used to accept the value data from user
		
		//int a = scanner.nextInt();
		
		//int b = scanner.nextInt(a);
	
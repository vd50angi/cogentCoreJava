package com.cogent.EmployeeManagementSystem;

import java.util.Scanner;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.service.EmployeeService;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class Main1 {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
			fileOutputStream.write("abc".getBytes());
		
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}catch  (IOException e) {
			e.printStackTrace();
				
		}
	
}
	//public static int division(int a, int b) {
	 // try {
		//FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
	  //fileOutputStream.write("abc.getBytes");
	 // }catch (FileNotFoundException e) {
		//  e.printStackTrace();
	  
	  
	 // }catch (IOException e) {
		  
		//  e.printStackTrace();
	  

		//***************start
	
		
		
		/*public int division(int a, int b) {
	 
		  int c = 0;
		 try {
			  
	         c = a/b;// internally it will create an object of arithmetic exception
			  //JVM will implicitly create the objects for all for all pre defined runtime 
			  //exceptions
			  
		  return c;   // if division is done the return the result.
		  }
		//	catch(ArithmeticException e) {
			  // to handle exception
			 // return -1; //theres gonna be issue if I return in -1
	
	catch(NullPointersException e) {
		 // to handle exception
		}
		  
		  finally {
		  System.out.println("inside the finally block");// finally block code
		}
		  
		 return -1;
	}
	
		public static void main(String[]args) {
			try {
				System.out.println(10/5);
				String s = nuill;
				System.class.out.println(s.concat("angie")); //s is holding that means
				/*s is not refering object
				 * to call concat method we need object
				 * since object as  not there and we are trying to call concat method
				 * then it thrwo NPE NullPointersException */
			//} //extreme child to top parent
			//catch (ArithmeticException e) {
				//handle exception
			//}
			//catch(NullPointersException e) {
				//handle exception
				
				//catch(RuntimeException e) {
				//}
				
		//catch(Exception e) {
			// handle exception
			//System.out.println("exception caught);"
				//	System.out.println(e.getClass().getName());
		//}
		//catch(Throwable e) {
			//handle exception
		//}
		/*Why no for object if object is able to handle it then everyclass is capable
		 * to handle the exception
		 * then what is difference between a normal class and exceptional class?
		 * 
		 */
			
		//catch(Object e) {
			//to handle exception
		//}
		
	//	} end here
		
			//public static void main(String[]args) {
				
				//int result = division(10, 5);
				
			//	int result = division(10, 0);
				
				//System.out.println(result); 
									
			
				
				
				
				
				//Scanner scanner = new Scanner(System.in);
			 
		/* in ==> static reference ==> used with class name
			scanner is a reference
			System is a class
			*/
			//it is used to accept the value data from user
			//System.out.println("Enter the data");
			
			//int c = 0, a= 0, b = 0; //instead of declaring a and b inside try block decalre it outside try block
			//try {
				// a = scanner.nextInt(); // will put in try block/right click choose surround block from int a to c= a/b
				
				// b = scanner.nextInt();
				 
				// c = a/b; //can I do that again?
				
				//System.out.println(a);
				//System.out.println(b);
				//c = a / b;
				
		//	} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//	System.out.println("exception occured");
			//	System.out.println("enter the value for b again");
			//	b =  scanner.nextInt(); //error
			//	c = a/b; // runtime exception
	/* you will give 3 attempts to  the user provide a non zero value for b
	    we are supposed to write exact solution for it in handling the exception       */
				
			}
			//finally { 
				/* Finally block is used in irrespective situation
				 * ex. closing the db connection, closing the file/closure work
				 * */
			 //System.out.println("inside the finally block");
			 /* it is executed after //the finally
			  * if its executed--then why shall I prefer finally??
			  * 
			  * 
			 */
			 
		//	} 
			//System.out.println("finally block");
			
			//System.out.println("division is "+ c);
			
			
			
			
			//public static void main(String[]args) {
				
				
				
				
				
				//*****
				
				//try { //if I have 10 statements ..I may have exception
					
					//System.out.println(10/0); /apply to pointers #1
					
					//System.out.println(10/5);
					//String s = null;
					//System.out.println(s.concat("angie")); //s is holding thats means
					/*  s is not referrring to object
					 * to call concat method we need object
					 * since object is not there and we need object
					 * since object is not there and we are trying to call concat method
					 * then it will throw NPE - null exception
					 * whos ehandling null exception? it s JVM*/
				//} 
				//extremem
				//catch (ArithmeticException  e) {
					// TODO: handle exception
				//}
				//catch(NullPointerException e) {
				
				//}
				
				//catch (RuntimeException e) {
				//	// TODO: handle exception
				//}
				
				
				
				//catch (Exception e) {
					// TODO: handle exception
					//System.out.println("exception caught");
				//	System.out.println(e.getClass().getName());
					//both exception are handle by exception
					/*exception is valid because its parent of null exception
					 *  and arithmentic exception 
					 *  then parent reference can handle child object
				*/
			//	catch (Throwable e) {
					// TODO: handle exception
			//	}
					//catch(object e) is not valid
					
			//*******	
			
//}			
				//catch (ArithmeticException) { /* unreachable catch block why ??? when i introduces catch exception?
				 //catch exception?
				
				//handle exception
				//
				//catch(NullPointerException e) {
					//handle null exception
				//System.out.println("caught Null pointer exception);
				
					
		
	



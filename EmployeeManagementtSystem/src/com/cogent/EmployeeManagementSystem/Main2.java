package com.cogent.EmployeeManagementSystem;

//import com.cogent.EmployeeManagementSystem.exception.InvalidSalaryException;
//import com.cogent.EmployeeManagementSystem.model.Employee;
//import com.cogent.EmployeeManagementSystem.service.EmployeeService;
//import com.cogent.EmployeeManagementSystem.service.EmployeeServiceImpl;


public class Main2 {
	
	//start
	
		public static void main(String[] args) {

			String s="cogent university";
			//System.out.println(s.length());
			//length method: string class
			//length property is: array
			
			StringBuffer buffer= new StringBuffer("abcdef");
			StringBuffer buffer1= new StringBuffer("abcde");
			System.out.println(buffer.delete(0, 5));
			
		}
}
		
			//System.out.println(	buffer.compareTo(buffer));
			
//			//Dc(default constructor): by default it is capable to hold 
//			//16 chars
//			//put chars==> capacity = chars+16
//			//put number ===> capacity = number
//			buffer.append("ShaotongChen");
//			// 12 chars
//			System.out.println(buffer.capacity());
//			System.out.println(buffer.length());
//			System.out.println();
//			buffer.append("...");
//			System.out.println(buffer.capacity());
//			System.out.println(buffer.length());
//			System.out.println();
//			
//			buffer.append("+");
//			System.out.println(buffer.capacity());
//			System.out.println(buffer.length());
//			buffer.append("sd");
//			System.out.println();
//			
//			System.out.println(buffer.capacity());
//			System.out.println(buffer.length());
//			
//			System.out.println();
//			System.out.println(buffer.toString());
//			
		
			
			
			
			
			/*	String result =s.substring(0,6);
			System.out.println(result);
			System.out.println(s.equals("cogent university"));
			System.out.println(s=="cogent university");
			System.out.println(s==new String ("cogent university"));
			//it is used to check that whether s and others 
			// reference is refering to same object or not(compare the address)
			//equals method used to check the content
			//== operator is used to check location in case of ref
			//in case of primitive ==> value would be the exception
			
			System.out.println("abi".codePointAt(0));
			System.out.println("ABI".codePointAt(0));
			System.out.println("abiDD".compareTo("abi"));
			System.out.println("a".compareTo("a"));
			System.out.println("b".compareTo("D"));
			
			
			
			
			
			
			
			
			
			
			
			/*
			//ip:192.168.1.1
			String ip= "192.168.1.1";
			//IP Address type : A B C D E
			//do we need to split this ip address on the 
			//basis of .?
			//0 ==>255  
			String [] ipAddress = ip.split("\\.");
			// \\.===> \.
			// \. is escape sequence
			System.out.println("\\.");
			try {
				for (String string : ipAddress) {
					
					int i= Integer.parseInt(string);
					if(i>=0 && i<=255) {
						System.out.println(i);
						
					}else
						System.exit(0);
				}
				int clasCell=Integer.parseInt( ipAddress[0]);
				
				if(clasCell>0 &&clasCell<=126) {
					System.out.println("Ip belongs to A");
				}else if(clasCell>127 &&clasCell<=191) {
					System.out.println("Ip belongs to b");
				}else if(clasCell>191 &&clasCell<=223) {
					System.out.println("Ip belongs to c");
				}else if(clasCell>223 &&clasCell<=239) 
					System.out.println("Ip belongs to d");
				else System.out.println("Ip belongs to f");
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		/*	String s="Angielyn DeVega";
			String s2="cogent";
			String s3= new String("cogent university");
	//CLASSNAME   REF= Runtime allocation
			String s4="Angielyn De Vega";
			String s5="cogent";
			//s4 and s point to same address.
			//s5 and s2 point to same address.
			System.out.println(s4.concat(" "+s5));
			//concate is the only one solction where
			//we can get new object
			System.out.println(s4);
			//becoz string objects immutable
			
			//at least 3-4 methods except concat
			//toUpperCase, toLowerCase(), ValueOf
			//replace?
			//which are returning new String objects
			 * 
			 * */
			 
	
			
			
			
			/*EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

		String result = null;
		try {
			result = employeeService.addEmployee(new Employee("ab001", "abhi", "chivate", 1234.0f));
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if("success".equals(result)) {
			System.out.println("employee added successfully");
		}
		
		}
}*/



		

		
		
	
	//start**  different topic code
	
		
		//public static void main(String[] args) {
	//	StringBuffer buffer = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		
		//buffer.delete(0,5);
	//	buffer.compareTo(buffer)
				
		//System.out.println(buffer);
		


		
	//** end	
		//**************
	/*public class MyClass {
	    public static void main(String args[]) {
	     public class MyClass {
    public static void main(String args[]) {
     
     StringBuffer buffer = new StringBuffer("Angie");
     SttringBuffer2 = new SrtingBuffer("Deveg");
     buffer.compareTo(buffer2);
	     StringBuffer buffer = new StringBuffer("Angie");
	     SttringBuffer2 = new SrtingBuffer("Deveg");
	     buffer.compareTo(buffer2);
		online java compoiler*/
		
	
	
	
	//because 500 capacity is provided..then remove..try other one kits 26 because 10 = 16 -= 26
		//DC : by default
	//capable to hold 16 characters
		//self growable/buffer
		//you will print per append
		//StringBuffer buffer = new StringBuffer();
	//	System.out.println(buffer.capacity());
		//buffer.append("Abhinandan");////append  method will add to the end
	//	System.out.println(buffer.capacity());
		//10
		
		//System.out.println(buffer.capacity());
	//	System.out.println(buffer.length());
	//	buffer.append("advik");
		//5 chars
	//	System.out.println(buffer.capacity());
	//	System.out.println(buffer.length());
         
     //  buffer.append(" ");
       //1 chars
      // System.out.println(buffer.capacity());
     //  System.out.println(buffer.length());
       
     //  buffer.append("a");
       //1 chars
     //  System.out.println(buffer.capacity());
     //  System.out.println(buffer.length());
       
	//}
	
	//end code here for this topic******************

		
		
		
			
	
	
	
	//start ## ;length ,method
	
	//public static void main(String[] args) {
	
		//System.out.println(s.length());
		//length method :string class
		//length property is : array
		
		//String s = "cogent  university";
		//s.isBlank(); // will give u error
	//	s.isEmpty();
		//System.out.println(s.isEmpty());	
		//end here code
	//}
//}
	
	//when to use length property  == belongs not array and when to used length method belongs to string class????
	
	//start new code
	//public static void main(String[] args) {
		
		//String s = "cogent  university";
		//s.isBlank(); // will give u error
		//s.isEmpty();
		//System.out.println(s.isEmpty());	
	
	
	//end new code
	
	
	//nstart
	//public static void main(String[] args) {
	
		//String s = "cogent university";
		
		//System.out.println("abi".codePointAt(0));
		//System.out.println("ABI".codePointAt(0));
		//System.out.println("abi".codePointAt(0));// giving output automatical using pointeAt method  output 97  65 32
		//System.out.println("abi".compareTo("aDI"));
		//System.out.println("a".compareTo("a"));
		//System.out.println("b".compareTo("D"));		
		//System.out.println("cogent".compareTo("aDI"));// if its not matching it will return to those 2?
		
	//}
		
 // end program
		
		
		
		
		
		
		
		
		
		
		//34rd program start uinder main method
		
		
		//public static void main(String[] args) {
			
			//34rd program start uinder main method
			
		//	String s = "cogent university";
		//String s = "cogent university"; //indexing begin with 0 in cogent university
		
		//int a = 10;
		//int c = 10;
		//System.out.println(a==c); //== is to check the values
				
		//System.out.println(s=="cogent university");
		//System.out.println(s==new String("cogent university");
		//System.out.println(s=="cogent university"); return false why--because is part of the spool it doesntg match 
	//}
	//{
		//end
		
		
		
		
		
		// returnning true  --double quoted  wuill part of spool cond 1
		//wii  allocate
		
		//== it is used to check that wehter s and other reference is refering to same object or not.
		
		//
		//System,out.println(s.equals("cogent university"));
		//.equals  will eqaual on the bases of cofgent univewrsity===
		//String result = s.substring(0,6); //it will print cogent ----counting the index 0 1 2 3 4 5 6  ///(7);
		//System.out.println(result);
		//substring -- part of 1 string
		//substring will give u new string object
		//equals method used to check the content
	//==  operartor is used to check location in case of reference
		//in case of primitive (proimitive type
		//ex  int a = 1-
		//int c = 10;
		//System.out .println (a==c)
		//in case primitive ==> value be the expectation
		
		
		
		
		
		
		
		//2nd task program 
		
		//ip:192.168.1
		//String ip = "192.168.1.1";
		//A B C D
		//do we need to split this ip address on the 
		//basis of. ?
		//0 to 255
		
		//try {
			//String [] ipAddress = ip.split("\\.");
		//	for (String string : ipAddress) {
				
			//	int a = Integer.parseInt(string);
			//	if(a>0 && a<=255) { // the range 
					/*do we need to split this ip address on the 
					basis of. ?
					0 to 255*/
					
				// }
				//else
					 //return;// return the previous ip adress..coming the main method or u can use 
				
				//System.exit(0);// u can use it if not using return;..other option  fir return;
				
			//}
			//int classCell = Integer.parseInt(ipAddress[0]);
			
		//	if(classCell>0 && classCell <=126) {
				
			//	System.out.println("IP belongs to class A");
			
			//}else if (classCell>=126 && classCell <= 191) {
				//System.out.print("IP belongs to B");
			
		//	} else if(classCell>=192 && classCell<=223) {
				//System.out.println("IP belongs to class C");
				
				
			//} else{
				//System.out.println("IP belongs to class D");
					
				//}
		//} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
	//** code end here
//output of the program IP belongs to C *********************
			
	
		
	
			
			
			//System.out.println(Integer.parseInt(string));
			
		//}//System.out.println(Integer.parseInt(string));
		//}
	

		// end here
		//************************************
		//task to do under main method
		//String ip = "192.0.1.1";
		//String ip = "244.0.0.0";
		//String [] ipAddress = ip.split("\\.");
		//for (String.out.println(Integer.parseInt(string));
		//String [] ipAddress = ip.address("\\.")
		
 // }
//}
		//********end here for the task
		
		
		
		//1st task programam
		//String s ="angie"; //s and s2 is part of stack
		//String s2 = "cogent";
		//String s3 = new String("cogent university");
		//CN  is classname| ref = TR allocation
		
		//String s4 ="angie";
		//String s5 = "cogent";
		//System.out.println(s4.concat(" " +s5));
		//concat method is only one solution that we can get new object
		//concat method will return only new concat object
		//System.out.println(s4);
		//becoz string objects are immutable
		
		/* toUpperCase, toLowerCase(),valueOf
		 * we need to find out atleast 3 to 4 methods except concat
		 * which are returning new String objects*/
		
		
		//String s6 = new String("");
		
		//System.out.println(s6.toUpperCaase(" " + s6));
		
		//im not done with the task
		
		
		
		
	//}

//}


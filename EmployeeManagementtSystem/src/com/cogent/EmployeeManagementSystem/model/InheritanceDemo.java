package com.cogent.EmployeeManagementSystem.model;
import com.cogent.EmployeeManagementSystem.model.Manager;

public class InheritanceDemo {
	
	
	


		
		public static final float PI = 3.14f;
		//static: only one copy
		//final:cant change the value
		public final int a;
		
		public int b;
		
		public InheritanceDemo() {
			this.a = 10;
		}
		
		//public  final static void main(String[]args) { it will work
		//public  static final void main(String[]args) { it will work with final postion
			
		
		public static  final void main(String[]args) {
			
			final int b = 100; // we can use final keyword inside the method
			
			// after initialize we can't change the value of b
			System.out.println("hello angie" + b);
		}
		
		
		
		
		//public static void main(String[] args) {
		
		// morning task - 09/22/21
		//-Employee  manager= new Manager();//new manager is your object
			//Parent type    :  child type
		// all functionalities from Employee + overridden methods
		//what will be the behavior of the object? 
		// the object will behave an employee class
		
		//-Manager manager= new Manager();
		// parent type  :   child type
		// now its behaving as manager now because the parent is manager
		//object behavior completely depending on ref(reference) type.
		
		//-System.out.println ("emp id "+manager.getEmpSalary());
		
		//-float salary = manager.calculateSalary(); //call from the manager class
		
		//-System.out.println(salary);
	   //- manager.calculateSalary(); //is it override? override calculate salary method
	  //calculate salary will ask the reference  manager if there's an object  calculate salary
	    //then it will go to manager class to calculate the salary
	    
		 //manager.setproj // note if we set as employee as parent it will now shot the setproj
	
	    //-Manager manager2 = (Manager) manager;
	    
	   //- System.out.println(manager2.getProjectAllow());
	    
	   //- ProjectManager pm = new ProjectManager();
	    // E + M + PM
	    
	    //-Manager pm = new ProjectManager();
	    // E + M
	    
	   //- Employee pm = new wProjectManager();
	    //E
	    
	    
	
	
	
	//create public manager object?
	
	//employee manager = new projectManager
	



}

package com.cogent.EmployeeManagementSystem;

public class TreeSet_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Comparator<Employee> comparator= new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
			
		};
		Comparator<Employee> comparator1= new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
			
		};
		//anonymous class
		
		TreeSet<Employee> employees= new TreeSet<>(comparator);
		try {
			employees.add(new Employee("AN0001", "angie", "devega", 1000.f, "VA"));
			employees.add(new Employee("AN0002", "angie", "devega1", 1000.f, "VA"));
			employees.add(new Employee("AN0003", "angie", "devega2", 1000.f, "VA"));
			//employees.add(null);
			//treeset not allow to addd null
			System.out.println(employees);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ClassCastException e) {
			
			System.out.println("exception caugth"+e);
		}
		
		
		//reeSet<String> set= new TreeSet();

		
		/*
		 * set.add("angie"); set.add("computer"); set.add("devega"); set.add("AN");
		 * set.add("pileo"); set.add("anhgie");
		 * 
		 * System.out.println(set);
		 */
		//TreeSet<String> set1= new TreeSet<>();
//		TreeSet<String> set2= new TreeSet<String>();
		

	}

}	
	
	
	
}

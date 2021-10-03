package com.cogent.EmployeeManagementSystem.model;

import com.cogent.EmployeeManagementSystem.InvalidSalaryExcception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data


public class Manager extends Employee {
	
	private String managerId;
	private float projectAllow;
	
	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return 3000;
	}
	public Manager() throws InvalidSalaryExcception {
		this("","","",1000.0f,100.0f,"");
	}
	public Manager(String empId, String firstName, String lastName, 
			float empSalary, float projectAllow, String managerId) throws InvalidSalaryException {
		super(empId,firstName,lastName,empSalary, "VA"); // it will give a call to contructor from parent class
		this.managerId="manager";
		this.projectAllow=projectAllow;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private String managerId;
	private float projectAllow;
	
	
	//public float calculateSalaryForManager() { //declare a method
		//the purpose of this method to calculate the salary
		//return 3000;
	@Override
	public float calculateSalary() {	
	return super.calculateSalary()
	
	
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public float getProjectAllow() {
		return projectAllow;
	}
	public void setProjectAllow(float projectAllow) {
		this.projectAllow = projectAllow;
	}
	public Manager() {
		this("", "","",1000.0f,1000.0f, "");
		
		//what will happen?by adding thatinside this method
		//purpose of this method is used to call 
		//constructor only, but constructor of the same class
		System.out.println("hello from manager default constructor");
	}
	
	public Manager(String empId, String firstName, String lastName, float empSalary, 
			 float projectAllow, String managerId) {
 //declaring object
		super(empId,firstName,lastName,empSalary); //it will give a call to constructor from parent class
 
		this.projectAllow = projectAllow;// this two will initialize with the manager
        this.managerId = "manager";
	
        
        
        // the super method will take u to employee constructor/ will call to parent class
	
       // public int Manager() {
       // String [] tech; I need to fix it its  ot clear to me
	
	}
}*/

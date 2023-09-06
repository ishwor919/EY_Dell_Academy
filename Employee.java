package com.programming.batch1;

public class Employee {
	int empID;
	String empName;
	String empDesignation;
	float empSalary;
	public int getEmpID(int empID) {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	public static void main(String [] args) {
		Employee emp = new Employee();
		
		emp.setEmpID(12345);
		emp.setEmpDesignation("Consultant");
		emp.setEmpName("Ishwor Mahato");
		emp.setEmpSalary(3000);
		
		System.out.println(emp.getEmpID(333));
		System.out.println(emp.getEmpDesignation());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSalary());

	}
	
}

package com.programming.batch1;

public class SelectionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 76;
		if(marks > 90 && marks < 100) {
			System.out.println("Excellent Grade");
		}
		else if(marks > 80 && marks < 90) {
			System.out.println("Very Good Grade");
		}
		else if(marks > 70 && marks < 80) {
			System.out.println("Good Grade ");
		}
		else {
System.out.println("Fail");
		}
	}

}

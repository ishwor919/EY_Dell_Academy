package com.programming.batch1;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grading('A');
		grading('B');
		grading('C');
		grading('D');
		
		static void grading(char grade) {
			int success;
			
			switch(grade) {
			case 'A':
				success = 1;
				System.out.println("Excellent Grade");
				break;
			
			case 'B':
			case 'C':
				success = 0;
				System.out.println("Good Grade");
				break;
				
		    default:
		    	success = -1;
		    	System.out.println("Unknown Grade");
		    	break;
	}
	passTheCourse(success);
}
		static void passTheCourse(int success) {
			switch(success) {
			case 1:
				System.out.println("Passed the course");
				break;
				
			case 0:
				System.out.println("Can you give the exam again, your option");
				break;
				
			case -1:
				System.out.println("Reschedule the exam date");
				break;
			}
}
	}


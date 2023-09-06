package com.programming.batch1;

public class LoopConstruct {
	public static void main(String [] args) {
		int n = 11; // Initialization
		while(n <= 10) { //Boolean expression or conditional expression
			System.out.println(n + " ");
			n++; //Iteration pr updation
		}
		
		//do{
		//System.out.println(n + " ");
		//while(n <= 10);
		System.out.println();
		
		//Same output ---> for loop
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		
		//infinite while
		//while(true){
		//System.out.println("All time true....");
		//}
		
		//Infinite for
		//for(;;){
		//for(int j = 0; j < 10;)
		//System.out.println("All time true....");
	   //}

}

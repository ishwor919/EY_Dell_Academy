package com.programming.class9;

//Instead of measuring actual time required in executing each statement
//Time complexity consider how many times each statement executes

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World"); //Once O(1)
		display();
	}
	
	static void display() {
		int n = 8;
		for(int i = 0; i < n ; i ++) {
			System.out.println("Hello World !!!\n"); //O(n)
		}
		
		for(int i = 1; i < n ; i=i*2) {
			System.out.println("Hello World !!!\n"); //O(log2(n))
	}
		
		for(int i = 2; i < n ; i = (int)Math.pow(i, 2)) {
			System.out.println("Hello World !!!\n");  //O(log(log(n))

		}
}
}

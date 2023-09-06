package com.programming.batch1;

public class Variable_Initialization {
	int number;
	
	//No argument
	Variable_Initialization(){
		number = 100;
	}
	
	Variable_Initialization(int number){
		//this keyword resolves the ambiguity between non static instance variable
		//and method parameter
		this.number  = number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable_Initialization obj = new Variable_Initialization();
		System.out.println("The value of number is " + obj.number);
		
		
		Variable_Initialization obj2 = new Variable_Initialization(10000);
		System.out.println("The value of number is " + obj2.number);

	}

}

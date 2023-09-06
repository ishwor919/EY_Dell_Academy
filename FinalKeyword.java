package com.programming.class4;

public class FinalKeyword { //cannot be overridden by any child class.
	
	final static String PAN_CARD_NUMBER;
	
	//public FinalKeyword() {
		static {
			PAN_CARD_NUMBER = "HRQPM1740F";
		
	}
	
	final void display() {
		System.out.println("Final Method ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword obj = new FinalKeyword();
		System.out.println("Obj is " + obj.PAN_CARD_NUMBER);
	}

}

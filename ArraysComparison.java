package com.programming.batch1;

import java.util.Arrays;

//Array is compared with equals method of java class

public class ArraysComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr1 = {1,2};
		int[] intArr2 = {1,2};
		
		boolean[] blnArr1 = {true, false};
		boolean[] blnArr2 = {true, false};
		
		if(intArr1 == intArr2) {
			System.out.println("=== Works for Arrays");
		}
		else {
			System.out.println("=== Doesn't Works for Arrays");
		}
		
		if(blnArr1 == blnArr2) {
			System.out.println("=== Works for Arrays");
		}
		else {
			System.out.println("=== Doesn't Works for Arrays");
		}
		
		boolean result = Arrays.equals(blnArr1, blnArr2);
		System.out.println("Result is " + result);
		
		
		boolean result2 = Arrays.equals(intArr1, intArr2);
		System.out.println("Result is " + result2);
	}
	

}

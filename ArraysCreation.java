package com.programming.batch1;

public class ArraysCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration - instantiation-
		
		int[] intArr = new int[6];
		
		//inittialization
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[3] = 30;
		intArr[4] = 40;
		intArr[5] = 50;
		
		//declaration, instantiated and initialization
		String[] strArr = {"A","B","C","D","E"};
		
		//traverse
		for(int i = 0; i <= intArr.length - 1; i++) {
			System.out.println(intArr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < strArr.length - 1; i++) {
			System.out.println(strArr[i] + " ");
		}
		
		
		System.out.println();

		
		for(int i : intArr) {
			System.out.print(i + " ");
		}
	}

}

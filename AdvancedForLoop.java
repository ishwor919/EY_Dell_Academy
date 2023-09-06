package com.programming.batch1;

public class AdvancedForLoop { // Can be used  only with Arrays

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		
		for(int data : intArr) {
			System.out.print(data + " ");
		}
		
		System.out.println();
		
		String[] strArr = {"A","B","C","D"};
		
		for(String str: strArr) {
			System.out.print(str + " ");
		}

	}

}

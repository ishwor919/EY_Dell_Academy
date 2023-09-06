package com.programming.batch1;

public class MinimumValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArr[] = {4,8,1,9,2,6,7,34,};
		min(intArr);
		
	}
	
		static void min(int[] intArr) {
			int min = intArr[0];
			for(int i = 0; i < intArr.length; i++) {
				if(min>intArr[i]) {
					min = intArr[i];
				}
			}
			
			System.out.println("The Minimum element is " + min);
		}

}

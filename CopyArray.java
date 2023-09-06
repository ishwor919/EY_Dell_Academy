package com.programming.batch1;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chArr1 = {'z','a','c','y','r'};
		char[] ch2 = new char[3];
		
		System.arraycopy(chArr1, 1, ch2, 0, 3);
		System.out.println(Arrays.toString(ch2));
		System.out.println(new String(ch2));

	}

}

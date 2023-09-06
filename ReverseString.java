package com.programming.class8;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("ISHWORI");
		System.out.println(" At first the String is :" + str);
		
//		str = str.reverse("ISHWOR");
//		System.out.println(" After reverse, the String is :" + str);

		
		StringBuilder sb = new StringBuilder("ISHWORI");
		sb.reverse();
		System.out.println(" After reverse, the String is :" + sb.toString());
	}

}

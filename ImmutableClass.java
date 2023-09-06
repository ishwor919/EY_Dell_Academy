//package com.programming.class8;
//
//public class ImmutableClass {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = new String("ABC");
//		System.out.println("After first step... " + str);
//		
//		str.concat("--XYZ");
//		System.out.println("After second step... " + str);
//		
//		
//		StringBuilder sb = new StringBuilder("ABC");
//		System.out.println("SB - After  first step - " + sb);
//		
//		sb.append("XYZ");
//		System.out.println("SB - After  second step - " + sb);
//
//
//	}
//
//}



package com.programming.class8;

public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("ABC");
		System.out.println("After first step... " + str);
		
		str = str.concat("--XYZ"); //making new object then concat will work
		System.out.println("After second step... " + str);
		
		
		StringBuilder sb = new StringBuilder("ABC");
		System.out.println("SB - After  first step - " + sb);
		
		sb.append("XYZ");
		System.out.println("SB - After  second step - " + sb.toString());


	}

}

//package com.programming.batch1;
//
//public class BreakKeyword {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i = 1; i<=3; i++) {
//			for(int j =1;j<=3;j++) {
//				if(i==2 && j==2)
//					break;
//					System.out.println(i + " " + j);
//			}
//		}
//	}
//
//}

package com.programming.batch1;

public class BreakKeyword { // It will break at the certain condition as per the code.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ: for(int i = 1; i<=3; i++) {
			for(int j =1;j<=3;j++) {
				if(i==2 && j==2)
					break XYZ;
					System.out.println(i + " " + j);
			}
		}
	}

}

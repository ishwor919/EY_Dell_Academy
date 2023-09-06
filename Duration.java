//package com.programming.batch1;
//
//public class Duration {
//	long startvalue, endvalue;
//	Duration (long startvalue,long endValue){
//		if(startvalue > endValue) {
//			throw new IllegalArgumentException("Start value can never be greater than end value");
//		}
//		this.startvalue = startvalue;
//		this.endvalue = endvalue;
//	}
//	
//	long duration() {
//		return endvalue - startvalue;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Duration obj = new Duration(21,19);
//		System.out.println("Duration is " + obj.duration());
//
//	}
//
//}

package com.programming.batch1;

public class Duration {
	long startvalue, endvalue;
	Duration (long startvalue,long endValue){
		if(startvalue > endValue) {
			throw new IllegalArgumentException("Start value can never be greater than end value");
		}
		this.startvalue = startvalue;
		this.endvalue = endvalue;
	}
	
	long duration() {
		return endvalue - startvalue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duration obj = new Duration(19,21);
		System.out.println("Duration is " + obj.duration());

	}

}



package com.programming.class5;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10 is Initial Capacity and 5 i load factor
		Vector<String> vec = new Vector<>(10,5);
		
		vec.addElement("Z");
		vec.addElement("Z");
		vec.addElement("Z");
		vec.addElement("Z");
		
		vec.addElement("A");
		vec.addElement("B");
		vec.addElement("C");
		
		vec.addElement("P");
		vec.addElement("Q");
		vec.addElement("R");
		
		vec.addElement("M");
		
		System.out.println("Size of vector is : " + vec.size());
		System.out.println("Capacity  of vector is : " + vec.capacity());

		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement() + " ");
		}



		
	}

}

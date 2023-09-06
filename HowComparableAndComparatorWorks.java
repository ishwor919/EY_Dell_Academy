package com.programming.class5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowComparableAndComparatorWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {10,2,34,78,23,56,11,87};
		Arrays.sort(intArr);
		System.out.println("Sorted Integer Arrays is " + Arrays.toString(intArr));
		
		String[] strArr = {"Z","A","C","R","Y"};
		Arrays.sort(strArr);
		System.out.println("Sorted String  Arrays is " + Arrays.toString(strArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Z");
		listStr.add("A");
		listStr.add("D");
		listStr.add("B");

		listStr.add("X");
		listStr.add("Y");
		
		Collections.sort(listStr);
		for(String str : listStr) {
			System.out.println(str + " ");
		}


	}

}

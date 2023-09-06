package com.programming.batch1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ForLoopPerformanceTest {
	
	static List<Integer> list = new ArrayList<>();
	static long startTime, endTime;
	
	static {
		for(int i = 0; i < 100_000_00;i++) {
			list.add(i); //prepare the data
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		startTime = Calendar.getInstance().getTimeInMillis();
		for(Integer i : list ) {};
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Advanced For Loop = " + (endTime - startTime) + "ms");
		
		startTime = Calendar.getInstance().getTimeInMillis();
		for(int i = 0; i < list.size(); i++ ) {};
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Basic For Loop - size - took = " + (endTime - startTime) + "ms");
		
		startTime = Calendar.getInstance().getTimeInMillis();
		int size = list.size();
		for(int i = 0; i<= size; i++) {};
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Basic For Loop - size calculated prior - " + (endTime - startTime) + "ms");
		
		
		startTime = Calendar.getInstance().getTimeInMillis();//left to be completed
		int size = list.size();
		for(int i = 0; i<= size; i++) {};
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Basic For Loop - size calculated prior - " + (endTime - startTime) + "ms");
		
		}

	}

}

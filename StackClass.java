package com.programming.class5;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<Integer> st = new Stack<>();
		showPush(st,45);
		showPush(st,76);
		showPush(st,47);
		
		showPop(st);
		showPop(st);
		showPop(st);
	}
	
	static void showPush(Stack<Integer>st,int a) {
		st.push(new Integer(a));
		System.out.println(st);
		
	}

	static void showPop(Stack<Integer>st) {
		st.pop();
		System.out.println(st);
	}
}

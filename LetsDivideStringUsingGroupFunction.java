package com.programming.class9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetsDivideStringUsingGroupFunction {
	
	private static final String PATTERN = " (.*) (\\d) (.*)";
	private static final String INPUT_LINE = "This is " + " Group 1 Regex Session";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile(PATTERN);
		Matcher m = p.matcher(INPUT_LINE);
		
		while(m.find()) {
			System.out.println("Default Group is " + m.group(0));
			System.out.println(" Group1 is " + m.group(1));
			System.out.println(" Group2 is " + m.group(2));
			System.out.println(" Group3 is " + m.group(3));
			System.out.println("Toatal Group count is " + m.groupCount());

		}

	}

}

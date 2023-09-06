package com.programming.class9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWithQuantifier {
	
	// * zero or more than once

	private static final String REGEX = "a*b";
	private static final String INPUT_STRING = "aabPQRabbMNOabXYZb";
	private static final String REPLACE = "-";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		StringBuffer sb = new StringBuffer();
		
		while(m.find()) {
			//append and replace
			m.appendReplacement(sb,REPLACE);
		}
		System.out.println(sb.toString());

	}

}

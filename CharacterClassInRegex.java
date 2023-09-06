package com.programming.class9;

import java.util.regex.Pattern;

//[abc] - a or b or c
public class CharacterClassInRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pattern.matches("[amn]","a")); //true
		System.out.println(Pattern.matches("[amn]","aa")); //false
		System.out.println(Pattern.matches("[amn]","m")); //true
		System.out.println(Pattern.matches("[amn]","mn")); //false
		
		//any character except a or m or n
		System.out.println(Pattern.matches("[^amn]","i")); //true   ---> ^ is negation which specify except those fi
		
		//any alphabet lowercase or uppercase
		System.out.println(Pattern.matches("[a-zA-Z]","B")); //true
		
		// a through d or m through p
		System.out.println(Pattern.matches("[a-d[m-p]]","e")); //false



	}

}

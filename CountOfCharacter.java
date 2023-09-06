package com.programming.class8;

import java.util.Scanner;
public class CountOfCharacter {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String yourName = sc.next();
        int count = 0;
        
//        char elementAtFifthIndex= str.charAt(5);
//        System.out.println(elementAtFifthIndex);
        
        System.out.println("Which Char want to search");
        char charToSearch = sc.next().charAt(0);
        for (int i = 0; i < yourName.length(); i++)
        {
            if (yourName.charAt(i) == charToSearch)
            {
                count++;
            }
        }
        System.out.println("Count is" + count);
    }
}
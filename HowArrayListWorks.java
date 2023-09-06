package com.programming.class5;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Insertion order =  maintained
		//Duplicates are allowed
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("A"); arrList.add("A"); arrList.add("A"); arrList.add("A");
		
		//any number of null is allowed
		arrList.add(null); arrList.add(null); arrList.add(null);
		
		arrList.add("Z"); arrList.add("X"); arrList.add("Y"); arrList.add("B");
		
		
		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("P"); arrList2.add("P"); arrList2.add("Q");
		
		//Adding second arraylist in first arraylist
		arrList.addAll(arrList2);
		
		//size of the arraylist
		System.out.println("Size of my array list is " + arrList.size());
		
		
		//removing first A
		arrList.remove("A");
		
		//Removing second arrayList from first arrayList
		arrList.removeAll(arrList2);
		
		//updating the element at first arrayList and keeping all elements of second arrayList
		arrList.retainAll(arrList2);
		
		
		
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
		//In the end , you clear your entire arrayList like this
		arrList.clear();
	}
}

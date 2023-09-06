package com.programming.class5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListWithBookObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Book> linkedList = new LinkedList<>();
		
		Book b1 = new Book(1, "A", "B", "C", 10);
		Book b2 = new Book(12, "P", "Q", "R", 100);
		Book b3 = new Book(32, "M", "N", "O", 1800);
		
		linkedList.add(b1);
		linkedList.add(b2);
		linkedList.add(b3);
		
		
		
		Iterator<Book> itr = linkedList.iterator();
		while(itr.hasNext()) {
			 Book b = itr.next();
			 System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}

	}

		
}
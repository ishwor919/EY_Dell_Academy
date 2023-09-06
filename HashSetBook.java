package com.programming.class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Book(int bookId,String author, String publisher, int quantity) {
	
}

public class HashSetBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Book> treeset = new TreeSet<>() ;
		
		Book b1 = new Book(1,"Ishwor","XY",200);
		Book b2 = new Book(2,"Mahato","AB",300);
		Book b3 = new Book(3, "Ram","PQ",400);
		
		treeset.add(b1);
		treesetadd(b2);
		treeset.add(b3);
		
		Iterator<Book> itr = treeset.iterator(){
			while(itr.hasNext()) {
				Book b = itr.next();
				System.out.println(b.bookId + " " + b.author + " " + b.publisher + " " + b.quantity);
			}
		}
	}	
			
				
		
		
		
		
///
		
		
		
		
		
		
		
		
		
//TreeSet<Book> treeSet = new TreeSet<>();
//		
//		Book b1 = new Book(1, "A", "B", "C", 10);
//		Book b2 = new Book(12, "P", "Q", "R", 100);
//		Book b3 = new Book(32, "M", "N", "O", 1800);
//		
//		treeSet.add(b3);
//		treeSet.add(b2);
//		treeSet.add(b1);
//
//		
//		Iterator<Book> itr = treeSet.iterator();
//		while(itr.hasNext()) {
//			 Book b = itr.next();
//			 System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
//				}
//	}
//
//}
//
//

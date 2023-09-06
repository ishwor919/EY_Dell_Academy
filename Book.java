package com.programming.class5;

public class Book implements Comparable<Book> {
	
	int bookId;
	String author, publisher, name;
	int quantity;
	
	//Constructor
	Book (int bookId, String author, String publisher, String name, int quantity) {
		this.bookId = bookId;
		this.author = author;
		this.publisher = publisher;
		this.name = name;
		this.quantity = quantity;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(bookId > o.bookId) {
			return 1;
		} else if(bookId < o.bookId) {
			return -1;
		} else {
			return 0;
		}
	}

}

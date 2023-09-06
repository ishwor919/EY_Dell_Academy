package com.programming.class9;

public class DoublyLinkedList {
		
		class Node {

			 

	        int data;

	        Node previous;

	        Node next;

	 

	        public Node(int data) {

	            this.data = data;

	 

	        }

	    }

	 

	        Node head, tail = null;

	 

	        public void addItem(int data) {

	            Node newNode = new Node(data);

	            if (head == null) {

	                head = tail = newNode;

	                head.previous = null;

	                tail.next = null;

	            } else {

	                tail.next = newNode;

	                newNode.previous = tail;

	                tail = newNode;

	                tail.next = null;

	 

	            }

	        }

	 

	        // will print all nodes of the list

	        public void display() {

	            Node Current = head;

	            if (head == null) {

	                System.out.println("list is empty");

	                return;

	 

	            }

	            System.out.println("nodes of double linklist:");

	            while (Current != null) {

	                System.out.println(Current.data + " ");

	                Current= Current.next;

	            }

	            System.out.println();

	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList obj  = new DoublyLinkedList();
		obj.addItem(10);
		obj.addItem(15);
		obj.addItem(10);
		obj.addItem(10);
		obj.addItem(10);
		obj.display();


	}

}

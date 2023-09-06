package com.programming.class4;

import java.util.Scanner;

class Heap{	///Heap is a complete Binary Tree and if the tree is not complete
	int heapSize;//then through the help of min and max we can make it
	
	void build_max_heap(int[] a) {
		heapSize  = a.length;
		for(int i = (heapSize/2); i>=0;i--) {
			max_heapify(a,i);
			
		}
	}
	
	void max_heapify(int[] a, int i) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		
		int largest  = i;
		
		if(l < heapSize && a[l] > a[largest]) {
			largest = l;
		}
		
		if(r < heapSize && a[r] > a[largest]) {
			largest = r;
		}
		
		if(largest != i) {
			int t = a[i];
			a[i] = a[largest];
			a[largest] = t;
			max_heapify(a,largest);
		}
	}
	
	int extract_max(int[] a) {
		if(heapSize < 0)
		{
			System.out.println("Underflow");
		}
		
		int max = a[0];
		a[0] = a[heapSize - 1];
		heapSize--;
		max_heapify(a,0);
		return max;
	}
	
	void increase_key(int[] a, int i, int key) {
		if(key < a[i]) {
			System.out.println("Error");
			a[i] = key;
			while (i >= 0 && a[(i - 1) / 2] <a[i]) {
				int t = a[(i - 1) / 2];
				a[(i - 1) / 2] = a[i];
				a[i] = t;
				
				i = (i - 1) / 2;
			}
		}
	}
	
	void print_heap(int[] a) {
		for(int i = 0; i < heapSize; i ++)
		{
			System.out.println(a[i] + " ");
		}
	}
}

public class HeapSpaceDataStructure {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		//We will assign a length to a array
		
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array :");
		
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		Heap obj = new Heap();
		
		obj.build_max_heap(arr);
		obj.print_heap(arr);
		
		System.out.println("Maximum value is " +  obj.extract_max(arr));
		System.out.println("Maximum Element is " +  obj.extract_max(arr));
		obj.increase_key(arr, 3, 100);
		obj.print_heap(arr);

	
	}

}

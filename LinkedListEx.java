package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll= new LinkedList<Integer>();
		
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		do {
			displayMenu();
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: 
				System.out.println("Enter element to add at last");
				ll.addLast(sc.nextInt());
				break;
			case 2: 
				System.out.println("Enter element to add at first");
				ll.addLast(sc.nextInt());
				break;
			case 3: 
				System.out.println("Enter element to add ");
				int element = sc.nextInt();
				System.out.println("Enter index :");
				int index= sc.nextInt();
				
				ll.add(index, element);
		         break;
				
			case 4: 
				System.out.println("Enter element to update");
				index = sc.nextInt();
				System.out.println("Enter new Value");
				element = sc.nextInt();
				ll.set(index, element);
				break;
			case 5: 
				ll.removeFirst();
				break;
			case 6: 
				ll.removeLast();
				break;
			case 7: 
				System.out.println("Enter element to delete");
				index = sc.nextInt();
				ll.remove(index);
				break;
			case 8: 
				System.out.println("Enter index to delete");
				index = sc.nextInt();
			    ll.remove();
			case 9: 
				System.out.println("List: "+ll);
				ll.addLast(sc.nextInt());
				break;
			case 10: 
				System.out.println("Existing.....");
				break;
		    default:
		    	System.out.println("Invalid choice");
			}
		}  while(choice != 10);

	}
	private static void displayMenu() {
		System.out.println("linked list operaion");
		System.out.println("Add element at last");
		System.out.println("Add element at First");
		System.out.println("Add element at given index");
		System.out.println("Update element at given index");
		System.out.println("Delete first element");
		System.out.println("Delete last element");
		System.out.println("delete given element");
		System.out.println("delete element at given index");
		System.out.println("display element");
		System.out.println("Exit");
		System.out.println("Enter your choice");
		System.out.println();
	}

}

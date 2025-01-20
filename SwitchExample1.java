package com.basic;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:- ");
		//int ans;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("1.Add 2.Substraction 3.Multiplication 4.Division");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: 
			  System.out.println(n1+n2);
			  break;
		case 2: 
			  System.out.println(n1-n2);
			  break;
		case 3: 
			  System.out.println(n1*n2);
			  break;
		case 4: 
			  System.out.println(n1/n2);
			  break;
	     default: System.out.println("Invalid choice");
		}
		

	}

}

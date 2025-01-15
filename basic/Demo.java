package com.basic;

import java.util.Scanner;

public class Demo {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number:- ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int small = c<(a<b?a:b)?c:((a<b)?a:b);
	System.out.println("Smallest number:- "+small);
}
  
}

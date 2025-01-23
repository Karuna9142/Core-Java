package com.basic;

import java.util.Scanner;

public class CompareThreeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int big = (n1>n2 && n1>n3)? n1:(n2>n3)? n2:n3;
		System.out.println("Largest Number is:- "+big);
	}

}

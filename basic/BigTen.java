package com.basic;

import java.util.Scanner;

public class BigTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i = 1,big = 0;
		while(i<=5) {
			System.out.println("Enter a number- ");
			n = sc.nextInt();
			
			if(n>big) 
				big = n;
		    i++;
		}
       System.out.println("Big ="+big);
	}

}

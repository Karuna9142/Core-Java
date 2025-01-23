package com.basic;

import java.util.Scanner;

public class SmallestOfTenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,i = 1,small = 0;
		
		System.out.println("Enter a number");
		while(i<=5)
		{
			n = sc.nextInt();
			
			if(i==1)
				small = n;
			else if(n<small)
			{
				small = n;
			}
			i++;
		}
        System.out.println("Smallest Number is:- "+small);
	}

}

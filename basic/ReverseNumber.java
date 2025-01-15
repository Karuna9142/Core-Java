package com.basic;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void print_rev(int num)
	{
		int temp = num;
		int rev = 0;
		
		while(num>0)
		{
			int rem = num%10;
			num = num/10;
			rev = rev*10+rem;
		}
		System.out.println("Reversed Number is:- "+rev);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:- ");
		
		int num = sc.nextInt();
		print_rev(num);

	}

}

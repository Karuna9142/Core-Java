package com.First;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 2; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(num+ " is a Prime Number");
		}
		else
		{
			System.out.println(num+ " is not a Prime Number");
		}

	}

}
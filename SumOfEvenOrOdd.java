package com.basic;

import java.util.Scanner;

public class SumOfEvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sumEven = 0,sumOdd = 0;
		
		for(int i = 1; i<=100; i++)
		{
			if(i%2==0) {
				sumEven += i;
			}
			else 
			{
				sumOdd += i;
			}
		}
       System.out.println("Sum of even number is: - "+sumEven);
       System.out.println("Sum of Odd number is:- "+sumOdd);
	}

}

package com.basic;

import java.util.Scanner;

public class PerfectSquare {
	
	static boolean checkPerfectSquare(double number)
	{
		for(int i = 1; i*i<=number; i++)
		{
			if((number%i==0) &&( number/i==i))
			{
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(checkPerfectSquare(num))
		{
			System.out.println(num+ " is perfect square");
		}
		else
		{
			System.out.println(num+ " is not perfect square");
		}
	}

}

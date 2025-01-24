package com.basic;

import java.util.Scanner;

public class PrimeEx {
	
	static boolean prime(int n)
	{
		boolean isPrime = true;
		for(int i = 2; i<n ; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter Prime number");
      int num = sc.nextInt();
      
      if(prime(num))
      {
    	  System.out.println(num+ " is prime number");
      }
      else
      {
    	  System.out.println(num+ " is not prime");
      }
	}

}

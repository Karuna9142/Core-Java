package com.basic;
import java.util.Scanner;

public class ReturnExample 
{
   public static int cal_fact(int num)
   {
	   int fact = 1;
	   for(int i = 1; i<=num; i++)
	   {
		   fact = fact*i;
	   }
	   return fact;
   }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		System.out.println("factorial of " +num+ "is" +cal_fact(num));

	}

}

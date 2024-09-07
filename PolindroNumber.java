package com.First;
import java.util.Scanner;

public class PolindroNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:- ");
		
		int num = sc.nextInt();
		int rev = 0;
		
		int temp = num;
		while(num>0)
		{
			int rem = num%10;
	        num = num/10;
	        rev = rev*10+rem;
		}
		if(temp==rev)
		{
			System.out.println(temp+ " is Polindrome number");
		}
		else
		{
			System.out.println(temp+ " is Not Polindrome number");
		}

	}

}

package com.First;
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
	    int sum = 0;
	    while(num>0)
	    {
	    	sum = sum+num%10;
	    	//int rem = num%10;
	    	num = num/10;
	    	//sum = sum+rem;
	    }
	    System.out.println("Sum of Digit is:- "+sum);

	}

}

package com.First;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:-");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number:-");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		System.out.println("Sum of two number is:- " +sum);
		

	}

}

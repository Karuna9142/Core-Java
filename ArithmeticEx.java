package com.operator;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter two number:-");
	  
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		System.out.println(num1%num2);

	}

}

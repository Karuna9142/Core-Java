package com.operator;
import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number:-");
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		//assignment operator
		num1 += 4;
		num2 -= 4;
		System.out.println(num1);
		System.out.println(num2);
		
		
		

	}

}

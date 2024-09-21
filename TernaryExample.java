package com.operator;
import java.util.Scanner;

public class TernaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number:- ");
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max_num = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Largest number is:- "+max_num);

	}

}

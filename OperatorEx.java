package com.example;
import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x = "Bob";
		String y = "Cat";
		
		System.out.println("Enter your username");
		String uname = sc.nextLine();
		
		System.out.println("Enter your password");
		String pass = sc.nextLine();
		
		if(uname.equals(x)&&pass.equals(y))
		{
			System.out.println("You are welcome");
		}
		else
		{
			System.out.println("Wrong password");
		}
	}

}

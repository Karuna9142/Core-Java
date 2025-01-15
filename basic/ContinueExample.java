package com.basic;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:- ");
		
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		int len = str.length();
		
		int count = 0;
		for(int i = 0; i<len; i++)
		{
			if(str.charAt(i)!=ch)
			{

				continue;
			}
			 count++;
		}
		System.out.println(ch+" found "+count+ "times");
		
	}

}

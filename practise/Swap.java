package com.demo;

public class Swap {

	public static void main(String[] args) {
		
		String str = "Karuna";
		String s = "";
		//str = s.toLowerCase();
		
		//System.out.println("Fibonacci Series:-");

		for(int i = str.length()-1; i>=0; i--)
		{
			s = s+str.charAt(i);
		}
		System.out.println(s);

	}

}

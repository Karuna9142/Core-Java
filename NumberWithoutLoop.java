package com.First;

public class NumberWithoutLoop {
	public static void printNumber(int a, int b)
	{
		if(a<=b)
		{
			System.out.println(a);
		}
		printNumber(a+1, b);
	}

	public static void main(String[] args)
	{
		int start = 1;
		int end = 100;
		
		printNumber(1,100);
	}

}

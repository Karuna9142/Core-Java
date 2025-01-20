package com.basic;

import java.util.Scanner;

public class SmallestOf10Num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, i = 1, min = 0;
		
		while(i<=5)
		{
			System.out.println("Enter a number:- ");
			 n = sc.nextInt();
			
			if(i<=n)
				 min = i;
			else if(n<min)
				min = n;
			i++;
		}
        System.out.println("Smaller Value:- "+min);
	}

}

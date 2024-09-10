package com.kkm;
import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:- ");
		
		int rows = sc.nextInt();
		//for printing rows
		
		for(int i = 1; i<=rows; i++)
		{
			for(int j = rows; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*
 * * * * *
 * * * *
 * * *
 * *
 * 
 
 
 */

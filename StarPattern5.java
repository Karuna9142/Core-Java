package com.kkm;
import java.util.Scanner;

public class StarPattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of rows:- ");
		int rows = sc.nextInt();
		
		for(int i = 1; i<=rows; i++)
		{
			for(int j = rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 1; i<=rows; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k = rows-1; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
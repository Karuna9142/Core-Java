package com.basic;

import java.util.Scanner;

public class SumOfGivenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		int n, i = 1, sum = 0;
		while(i<=5)
		{
			System.out.println("Enter a number");
			n = sc.nextInt();
			sum += n;
			i++;
		}
        System.out.println("Sum:- "+sum);
       
  }

}

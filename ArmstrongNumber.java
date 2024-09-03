package com.First;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			num = num/10;
			sum = sum+rem*rem*rem;
		}
		if(temp==sum)
		{
			System.out.print("Armstrong Number");
		}
		else
		{
			System.out.print("not Armstrong Number");
		}
	}

}

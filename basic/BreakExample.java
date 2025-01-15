package com.basic;
import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		int arr[] = {3,4,5,6,12,34,2,1,99};
		
		System.out.println("Enter the element to search:-");
		int search = sc.nextInt();
		
		int i ;
		int result = 1;
		for( i = 0; i<arr.length; i++)
		{
			if(arr[i]==search)
			{
				result = 1;
				break;
			}
		}
		System.out.println(search+ " found at index "+i);

	}

}

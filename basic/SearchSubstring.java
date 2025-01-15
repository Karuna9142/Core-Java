package com.basic;
import java.util.Scanner;

public class SearchSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:- ");
		String str = sc.nextLine();
		
		System.out.println("Enter a Substring");
		String subStr = sc.nextLine();
		
		int max = str.length()-subStr.length();
		
		boolean find = false;
		for(int i = 0; i<=max; i++)
		{
			int n = subStr.length();
			int j = i;
			int k = 0;
			
			while(n--!=0)
			{
				if(str.charAt(j++)!=subStr.charAt(k++))
				{
					continue;
				}
			}
			find = true;
			break;
					
		}
		System.out.println(find? "Found it":"Didn't find it");
		
		
	}

}

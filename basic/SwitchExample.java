package com.basic;
import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days of week");
		String days = sc.nextLine();
		
		switch(days)
		{
		case "1": 
			days = "Sunday";
			break;
		case "2": 
			days = "Monday";
			break;
		case "3": 
			days = "Tuesday";
			break;
		case "4": 
			days = "Wednesday";
			break;
		case "5": 
			days = "Thursday";
			break;
		case "6": 
			days = "Friday";
			break;
		case "7": 
			days = "Sturday";
			break;
		default:
			days = "Invalid input";
			break;
		
		}
		System.out.println("Week of the days is:- "+days);
		

	}

}

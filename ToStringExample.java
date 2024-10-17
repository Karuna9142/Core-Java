package com.example;

import java.util.Scanner;

class Employee
{
	int empid;
	String name;
	String city;
	
	//constructor
	Employee(int empid, String name, String city)
	{
		this.empid = empid;
		this.name = name;
		this.city = city;
	}
	
	//toString() method used to reperesent any object as string
	public String toString()
	{
		return empid+ " "+name+ " "+city;
	}
}
public class ToStringExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id, name and city");
		
		int id = sc.nextInt();
		String name = sc.next();
		
		String city = sc.next();
		Employee e1 = new Employee(id, name, city);
		
		System.out.println(e1);
		
		
	}

}

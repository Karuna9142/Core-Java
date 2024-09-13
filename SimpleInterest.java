package com.kkm;
import java.util.Scanner;

public class SimpleInterest
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle,time,rate");
		double p = sc.nextDouble();
		
		double t = sc.nextDouble();
		double r = sc.nextDouble();
		
		double SI = p*r*t/100;
		System.out.println("Simple Interest:- "+SI);
		}

	}



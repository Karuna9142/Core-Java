package com.First;
import java.util.Scanner;

public class RectangleAndCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your shape:- 1.Rectangle  2.Circle");
		int shape = sc.nextInt();
		
		if(shape==1)
		{
			System.out.println("Enter length and breadth of rectangle:- ");
			int length = sc.nextInt();
			
			int breadth = sc.nextInt();
			System.out.println("Enter your choice:- 1.Area 2.Perimeter");
			
			int choice = sc.nextInt();
			if(choice==1)
			{
				float area = length*breadth;
				System.out.println("Area of Rectangle is:- "+area);
			}
			else
			{
				float perimeter = 2*(length+breadth);
				System.out.println("Area of Perimeter is: - "+perimeter);
			}
			
		}
		else
		{
			System.out.println("Enter the radius:- ");
			float radius = sc.nextFloat();
			
			System.out.println("Enter your choice:- 1.Area 2.Circumference");
			int choice = sc.nextInt();
			
			if(choice==1)
			{
				float Area = 3.14f*radius*radius;
				System.out.println("Area of Circle is:- "+Area);
			}
			else
			{
				float circumference = 2*3.14f*radius;
				System.out.println("Circumference of Circle is:- "+circumference);
			}
		}
		

	}

}

package com.objectOrientedPro.object;

class Student {
	int rollNum;
	String studName;
	int marks1;
	int marks2;
	int marks3;
	int totalMarks;
	
	void setStudDetails() {
		rollNum = 1;
		studName = "Radhe";
		marks1 = 50;
		marks2 = 70;
		marks3 = 45;
	}
	void calculateTotal()
	{
		totalMarks = marks1+marks2+marks3;
	}
	void displayStudDetails()
	{
		System.out.println("Roll Number  =  "+rollNum);
		System.out.println("Student Name = "+studName);
		System.out.println("Total Marks = "+totalMarks);
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student();
     s1.setStudDetails();
     s1.calculateTotal();
     s1.displayStudDetails();
     
     Student s2 = new Student();
     //s2.setStudDetails();
     //s2.calculateTotal();
     s2.displayStudDetails();
	}

}

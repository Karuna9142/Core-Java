package com.objectOrientedPro.object;

public class Employee {
	
	int empNum;
	String empName;
	double salary;
	
	void setEmpDetails(int eno, String ename, double esalary)
	{
		empNum = eno; //hard coded data
		empName = ename;
		salary = esalary;
		/*
		empNum = 111;
		empName = "Karuna";
		salary = 45000; */		
	}
	void dispEmpDetails()
	{
		System.out.println("Emp Num:- "+empNum);
		System.out.println("Emp Name:- "+empName);
		System.out.println("Salary:- "+salary);
	}
	public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.setEmpDetails(1, "priti", 3400);
    e1.dispEmpDetails();//give default value without setEmpdetails()method
    
    Employee e2 = new Employee();
    e2.setEmpDetails(2, "Priya", 2300);
    e2.dispEmpDetails();
   
	}
}

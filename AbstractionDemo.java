package com.abstraction.Interfcae;

//Abstract class is declared with the abstract keyword
// it need to be extended or implemented
//it can not be instantiated
// it can have constructor and static method 
// it can have final method

abstract class Student 
{
	int id;
	String name;
	
	//parameterized Constructor
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;		
	}
	
	//abstract method
  abstract void show();
  
  //non abstract method
  public void print_info()
  {
	  System.out.println("Hello");
  }
  //Static method
  static void run()
  {
	  System.out.println("Running....");
  }
}
class Student_info extends Student
{
    double salary;
	Student_info(int id, String name, double salary) 
	{
		super(id, name);
		this.salary = salary;
		
	}
	@Override
	void show()
	{
	 System.out.println("Hello everyone...");
	}
	
	//method to display
	 public void display()
	 {
		 System.out.println(id+ " "+name+ " "+salary);
	 }
	
	//toString method
	public String toString()
	{
		return id+ " "+name+ " "+salary;
	}
	
}
 class AbstractionDemo
{
	public static void main(String[] args)
	{
	
		Student s1 = new Student_info(101,"Priya", 34000.6);
		Student s2 = new Student_info(101,"Priya", 34000.6);
		
		s1.print_info();
		s1.show();
		s1.run();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		
		
		
	}
}

package com.objectOrientedPro.object;

class MyClass 
{
	int m; //instance or non-static variable
	static int n;
	
	void xxx()
	{
		m = 10;
		n = 20; //static variable
	}
	static void yyy()//class or static method
	{
		//m = 30; //error - non - static variable m cannot be referenced from static content
		n = 40;
	}
	void display()
	{
		System.out.println("m=" +m+ " "+"n=" +n );
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		mc1.xxx();
		mc1.display(); // m = 10 n = 20
		
		MyClass mc2 = new MyClass();
		mc2.display(); //m = 0 n = 20
		mc2.yyy();
		
		mc1.display(); //m = 10 n = 40
		mc2.display(); // m = 0 n = 40

	}

}

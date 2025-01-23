package com.objectOrientedPro.inheritance;

class Base1
{
	int i;
	int j;
	void input(int i, int j)
	{
		this.i = i;
		this.j = j;	
	}
	void display()
	{
		System.out.println("i= " +i+ " j= "+j);
	}
}
class Derive extends Base1
{
	int k;
	void input(int k)//overloaded method
	{
		this.k = k;
	}
	void display() //overridden method
	{
		super.display();//invokes base class display
		System.out.println(" k = "+k);
	}
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 b = new Base1();
		b.input(10,20);
		b.display();
		
		Derive d = new Derive();
		d.input(50);
		d.input(5, 8);
		d.display();
		
		
		

	}

}

package com.objectOrientedPro.inheritance;

class Base 
{
	int i;
	int j;
	
	void inputIJ(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void displayIJ()
	{
		System.out.print("i= "+i+ " j= "+j);
	}
}
class Derived extends Base
{
	int k;
	void inputK(int k)
	{
		this.k = k;
	}
	void displayK()
	{
		System.out.print(" K = "+k+ " ");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.inputIJ(10, 20);
		b1.displayIJ();
		
		Derived d1 = new Derived();
		d1.inputK(30);
		d1.displayK();
		
		d1.inputIJ(40, 50);
		d1.displayIJ();

	}

}

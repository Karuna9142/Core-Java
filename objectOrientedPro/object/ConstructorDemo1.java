package com.objectOrientedPro.object;

class Sample{
	int i;
	int j;

	Sample(int i, int j){ //parametrized Constructor
		this.i = i;
		this.j = j;
	}
	void display()
	{
		System.out.println("i = "+i+ " j = "+j);
	}
}
public class ConstructorDemo1 {

	public static void main(String[] args) {
		Sample s = new Sample(1,2);
		s.display();

	}

}

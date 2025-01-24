package com.abstracts;

abstract class Vehicle{
	
	//abstract method
	abstract void drive();
	void applyBreaks()
	{
		System.out.println("Applying Break");
	}
}
class Car extends Vehicle{
	void changeGear()
	{
		System.out.println("Changing gear");
	}

	@Override
	void drive() {
		System.out.println("I will drive the car");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
      
		//Vehicle v1 = new Vehicle//error beacause we can not create the instance of abstract class
		Vehicle v1 = new Car(); // it can only invokes overridden method
		v1.applyBreaks();
		v1.drive();
		//v1.changeGear() 
		Car c1 = new Car();
		c1.changeGear();
		

	}

}

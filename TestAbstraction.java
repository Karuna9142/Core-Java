package com.abstraction.Interfcae;

abstract class Bank
{
	abstract int getRateOfInterest();
}
class SBI extends Bank
{

	@Override
	int getRateOfInterest() {
		
		return 7;
	}
	
}
class PNB extends Bank
{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
public class TestAbstraction {

	public static void main(String[] args) {
		Bank b = new SBI();
		Bank b1 = new PNB();
		
		System.out.println("Rate of Intrest of SBI is "+b.getRateOfInterest()+ "%");
		System.out.println("Rate of Intrest of SBI is "+b1.getRateOfInterest()+ "%");
	}

}

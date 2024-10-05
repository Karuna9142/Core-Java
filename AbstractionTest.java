package com.abstraction.Interfcae;

abstract class Mountain
{
	abstract void hill();
}
class Masoori extends Mountain
{

	@Override
	void hill()
	{
		System.out.println("Beautiful place..");
	}
}
class Gulmarg extends Masoori
{
	@Override
	void hill() 
	{
	  System.out.println("Gulamrg is a nice place for spending weekend");
	}
	
}
public class AbstractionTest {

	public static void main(String[] args) {
		
		Mountain m1 = new Gulmarg();
		Mountain m2 = new Masoori();
		
		m1.hill();
		m2.hill();

	}

}

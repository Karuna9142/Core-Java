package com.exceptionEx;

class Product  //extends Object internally
{
	int pid;
	String pname;
	double price;
	
	Product (int pid, String pname, double price)
	{
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	Product() {}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Product prod = new Product(111, "Monitor", 500.0);
    System.out.println(prod); //invokes toString9() implicitly
    
	}

}

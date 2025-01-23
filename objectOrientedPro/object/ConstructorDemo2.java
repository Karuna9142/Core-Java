package com.objectOrientedPro.object;

class Item {
	int itemNum;
	String itemName;
	Item(int itemNum, String itemName) //parameterized constructor
	{
		this.itemNum = itemNum;
		this.itemName = itemName;
	}
	Item(){}//default Constructor
	
	void display()
	{
		System.out.println("Item Num = "+itemNum);
		System.out.println("Item Name = "+itemName);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Item i1 = new Item(111,"tinku");
		i1.display();
		
		Item i2 = new Item(); //it will display default values
		i2.display();

	}

}

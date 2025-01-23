package com.objectOrientedPro.object;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Number:- ");
		int itemNum = sc.nextInt();
		
		System.out.println("Enter item Name");
		String itemName = sc.next();
		
		System.out.println("Enter rate and quantity");
		double rate = sc.nextDouble();
		int qty = sc.nextInt();
		
		double price = rate*qty;
		double discount = 0.0;
		if(price>=1000 && price<2000)
			discount = 0.10 *price;
		else
			if(price>2000 && price<3000)
				discount = 0.15*price;
			else
				if(price>3000 && price<5000)
					discount = 0.20*price;
				else
					if(price>=5000)
					discount = 0.25 *price;
		
		double netPrice = price - discount;
		System.out.println("Item Number = "+itemNum);
		System.out.println("Item Name = "+itemName);
		System.out.println("Price = "+price);
		System.out.println("Discount = "+discount);
		System.out.println("Net Price = "+netPrice);

	}

}

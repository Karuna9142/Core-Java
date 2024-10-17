package com.example;

import java.util.ArrayList;

public class ToArrayExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> color_list = new ArrayList<>(5);
		
		color_list.add("Red");
		color_list.add("Blue");
		color_list.add("Yellow");
		color_list.add("Green");
		color_list.add("Orange");
		
		System.out.println("Size of list is:- "+color_list.size());
		for(String s1:color_list)
		{
			System.out.println("Color = "+s1);
		}
		
		//toArray()  = is used to fetch an array containing all the elementof an array
		// in ordered sequence
		Object[] obj = color_list.toArray();
		System.out.println("Print element from first to last");
		
		for(Object o1 :obj)
		{
			System.out.println("Color:- "+o1);
		}
	}

}

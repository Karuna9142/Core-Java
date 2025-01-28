package com.collections;

import java.util.LinkedList;

public class GenericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a1 =new LinkedList();
		//a1.add(10);
		a1.add("xxx");
		a1.add("yyy");
		a1.add("zzz");
		
		System.out.println(a1);
		for(String s: a1)
		{
			System.out.println(s);
		}

	}

}

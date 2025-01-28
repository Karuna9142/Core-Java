package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a1 =new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("xxx");
		a1.add("yyy");
		System.out.println(a1);
        a1.add(2, "ppp");
        System.out.println(a1);
        a1.set(2, "qqq");
        System.out.println(a1);
        
        a1.remove("qqq");
        System.out.println(a1);
        
        String s = (String) a1.get(2);
        System.out.println(s);
        
        System.out.println("Size = "+a1.size());
	}

}

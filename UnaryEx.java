package com.operator;

public class UnaryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 13;
		int b = 10;
		
		System.out.println(a++);//13
		System.out.println(++a);//15
		
		System.out.println(a--);//15
		System.out.println(--a);//13
		
		System.out.println(a++ + b++);
		System.out.println(++a + ++b );
		
		System.out.println(a-- - b--);
		System.out.println(--a - --b);
	}

}

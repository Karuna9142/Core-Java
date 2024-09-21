package com.operator;

public class TernaryEx {

	public static void main(String[] args) {
		//consist of three operands only(?:)
		
		int x, y;
	    x = 20;
	    // condition?expression:expression//true:false
        y = (x==1)?30:90;
        
        System.out.println("Value of y is:- "+y);
        
        y = (x==20)?30:90;
        System.out.println("value of y is:- "+y);
	}

}

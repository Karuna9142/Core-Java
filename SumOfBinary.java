package com.demo;

public class SumOfBinary {
	
	static String addTwoBinaryNum(String b1, String b2)
	{
	  int i = b1.length()-1, j = b2.length()-1;
	  int carry = 0;
	  StringBuilder result = new StringBuilder();
	  while(i>=0 || j >= 0) {
		  int sum = carry;
		  if(i>=0) {
			  sum += b1.charAt(i) - '0';
		  }
		  if(j>=0) {
			  sum += b2.charAt(j) - '0';
		  }
		  if(sum == 0 || sum == 1) {
			  result.append(sum);
			  carry = 0;
		  }
		  else if(sum == 2) {
			  result.append("0");
			  carry = 1;
		  }
		  else {
			  result.append("1");
			  carry = 1;
		  }
		  i--;
		  j--;
	  }
	  if(carry ==1) {
		  result.append("1");
	  }
	  return result.reverse().toString();
		
	}

	public static void main(String[] args) {
		String x = "011011";
		String y = "1010111";
		
		System.out.println(addTwoBinaryNum(x, y));

	}

}

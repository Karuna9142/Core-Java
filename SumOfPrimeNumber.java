package com.basic;

 class SumOfPrimeNumber {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int n = 2; n<=100; n++)
		{
			if(PrimeEx.prime(n))
				sum = sum+n;
		}
		System.out.println("Sum of prime = "+sum);

	}

}

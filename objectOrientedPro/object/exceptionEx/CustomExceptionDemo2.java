package com.exceptionEx;

import java.util.Scanner;

class WithdrawException extends Exception
{
	WithdrawException(String msg)
	{
		super(msg);
	}
	WithdrawException() {}
}
class Account{
	int amount;
	int balance;
	void withdraw( int amount, int balance) throws WithdrawException
	{
	 if(amount> balance)
	 {
		 throw new WithdrawException ("Insufficient Balance");
	 }
	 else
	 {
		 System.out.println("Your balance is "+balance+ " You can withraw amount "+amount);
	 }
	}
}
public class CustomExceptionDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your balance");
		int balance = sc.nextInt();
		
		System.out.println("Enter your amount");
		int amount = sc.nextInt();
		
		Account a1 = new Account();
		try {
			a1.withdraw(balance, amount);
		} catch (WithdrawException e) {
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}

package com.objectOrientedPro.object;

class Account {
	int accountNo;
	String accountType;
	int accountBalance;

	
	void setAccountDetails()
	{
		accountNo = 4790998;
		accountType = "saving";
		accountBalance = 5000;
		
	}
	void withdraw(int amt) {
		accountBalance = accountBalance-amt;
	}
	void deposit(int amt)
	{
		accountBalance = accountBalance+amt;
	}
	void dispAcoountDetails()
	{
		System.out.println("Account No = "+accountNo);
		System.out.println("AccountType = "+accountType);
		System.out.println("AccountBalance = "+accountBalance);
	}
	
}
public class AccountExample {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccountDetails();
		a1.withdraw(3000);
		a1.deposit(4000);
		a1.dispAcoountDetails();
	}

}

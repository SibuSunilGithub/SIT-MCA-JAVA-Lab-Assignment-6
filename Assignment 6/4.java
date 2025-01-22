/*
Write a class called Account with the following properties and methods:
Properties: String name, int acc_no,double balance
Methods: void deposit(int amt)
 void withdraw(int amt), 
 void transfer (Account acc1, Account acc2, int amt)
Assume that an account needs to have a minimum balance of 500. If an attempt is 
made to withdraw or transfer, which results in balance below 500, throw a user 
defined exception called MinimumBalanceException.
*/

import java.util.Scanner;

class MinimumBalanceException extends Exception {
	private String mes;

	MinimumBalanceException(String mes) {
		this.mes = mes;
	}

	public String getMessage() {
		return mes;
	}

	public String toString() {
		return mes;
	}
}

class Account {
	public String name;
	public int acc_no;
	private double balance;

	Account(String name, int acc_no, double balance) {
		this.name = name;
		this.acc_no = acc_no;
		this.balance = balance;
	}

	public void deposit(int amt) {
		this.balance += amt;
		System.out.println("Rs." + amt + " deposit successful for account holder " + name);
	}

	public void withdraw(int amt) throws MinimumBalanceException {
		if (this.balance - amt < 500)
			throw new MinimumBalanceException(
					"The minimun balance must be 500. cannot withdraw Rs." + amt + " from account holder " + name);
		this.balance -= amt;
		System.out.println("Rs." + amt + " withdraw successful for account holder " + name);
	}

	public void transfer(Account acc1, Account acc2, int amt) throws MinimumBalanceException {
		if (acc1.balance - amt < 500)
			throw new MinimumBalanceException(
					"The minimun balance must be 500. cannot transfer Rs." + amt + " from account holder " + name);
		acc1.balance -= amt;
		acc2.balance += amt;
		System.out.println("Rs." + amt + " transfer successful for account holder " + name);
	}
}

class Ass {
	public static void main(String args[]) {
		Account acc1 = new Account("himansu", 123456, 887.12);
		Account acc2 = new Account("Jagan", 8567623, 1231.76);
		try {
			acc1.deposit(123);
			acc1.withdraw(342);
			// acc1.withdraw(1631);

			acc2.deposit(413);
			acc2.withdraw(765);
			// acc2.withdraw(2333);

			acc1.transfer(acc1, acc2, 12);
			acc2.transfer(acc2, acc1, 1221);
		} catch (MinimumBalanceException me) {
			System.out.println(me);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
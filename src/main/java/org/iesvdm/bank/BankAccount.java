package org.iesvdm.bank;

public class BankAccount {

	private int id;
	private double balance = 0;
	private static int lastId = 0;

	public BankAccount() {
		this.id = ++lastId;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		handleNegativeAmount(amount);
		balance += amount;
	}

	public void withdraw(double amount) {
		handleNegativeAmount(amount);
		if (balance - amount < 0) {
			throw new IllegalArgumentException
				("Cannot withdraw " + amount + " from " + balance);
		}
		balance -= amount;
	}
	
	public void payTaxes(double percent) {
		// TODO: 02/06/2023
	}

	private void handleNegativeAmount(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative amount: " + amount);
		}
	}
}

package com.practice.questions.exception_handling_problems;

import java.util.Scanner;

public class Account {
	private int balance = 3000;

	public int balance() {
		return balance;
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			throw new InsufficientFundException("Insufficient balance in your account...");
		}
		balance = balance - amount;
	}

	public static void main(String[] args) {
		Account ac = new Account();

		Scanner scan = new Scanner(System.in);
		System.out.println("Current balance : " + ac.balance());

		System.out.println("Enter withdrawal amount");
		int amount = scan.nextInt();

		ac.withdraw(amount);

		System.out.println("Current balance : " + ac.balance());
	}

}

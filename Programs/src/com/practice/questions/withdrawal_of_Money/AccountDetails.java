package com.practice.questions.withdrawal_of_Money;

import java.util.Scanner;

public class AccountDetails implements Runnable {
	Account account = new Account();

	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {

			makeWithdrawal(500);
			if (account.getBalance() <= 0) {
				System.out.println("Insufficient fund in your account");
			}
		}
	}

	public synchronized void makeWithdrawal(int amt) {

		if (account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amt);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int bal = account.withdraw(amt);
		System.out.println(Thread.currentThread().getName() + " completed withdrawal, available balance is " + bal);
		System.out.println();
	}

}

package com.practice.questions.withdrawal_of_Money;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		AccountDetails accountDetails = new AccountDetails();
		Thread thread1 = new Thread(accountDetails);
		Thread thread2 = new Thread(accountDetails);

		System.out.println("Enter first name to be withraw amount");
		String name1 = scan.nextLine();
		System.out.println("Enter second name to be withraw amount");
		String name2 = scan.nextLine();
		thread1.setName(name1);
		thread2.setName(name2);

		thread1.start();
		thread2.start();

	}

}

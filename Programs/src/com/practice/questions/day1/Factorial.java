package com.practice.questions.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number>> ");
		int number = scan.nextInt();

		int f = 1;

		for (int i = 1; i <= number; i++) {
			f = f * i;

		}
		System.out.println("Factorial of " + number + " is " + f);
	}

}

package com.practice.questions.day2;

import java.util.Scanner;

public class Sum_Of_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number >> ");
		long num = scan.nextLong();
		long i = 0;
		while (num != 0) {
			i = i + num % 10;
			num = num / 10;

		}

		System.out.println("Sum of all digits are >>" + i);
	}

}

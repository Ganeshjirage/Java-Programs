package com.practice.questions.day2;

import java.util.Scanner;

public class SquareRoot {

	public static void square() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number >> ");
		double d = scan.nextDouble();

		double d1 = Math.sqrt(d);

		System.out.println("The square root of " + d + " is " + d1);
	}

	public static void main(String[] args) {

		square();
	}

}

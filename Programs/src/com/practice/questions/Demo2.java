package com.practice.questions;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
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

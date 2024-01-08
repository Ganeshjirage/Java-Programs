package com.practice.questions.day1;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number>>");
		int number = scan.nextInt();

		Even_Number demo = new Even_Number();
		int i = number;
		if (i % 2 == 0) {
			System.out.println("the number is Even");
		} else {
			System.out.println("The number is Odd");
		}
	}

}

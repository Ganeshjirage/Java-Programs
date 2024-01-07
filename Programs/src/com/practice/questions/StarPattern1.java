package com.practice.questions;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number>> ");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

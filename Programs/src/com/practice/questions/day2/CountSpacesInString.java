package com.practice.questions.day2;

import java.util.Scanner;

public class CountSpacesInString {

	public void demo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = scan.nextLine();

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				counter++;
			}
		}
		System.out.println("Total space in string are " + counter);
	}

	public static void main(String[] args) {
		CountSpacesInString cps = new CountSpacesInString();
		cps.demo();

	}

}

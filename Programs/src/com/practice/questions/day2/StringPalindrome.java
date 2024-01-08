package com.practice.questions.day2;

import java.util.Scanner;

public class StringPalindrome {

	public void palindrome() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name >> ");
		String str = scan.nextLine();

		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		if (str.equals(str1)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

	public static void main(String[] args) {
		StringPalindrome sp = new StringPalindrome();
		sp.palindrome();
	}

}

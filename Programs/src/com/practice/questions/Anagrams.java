package com.practice.questions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static boolean anagrams(String str1, String str2) {

		// converted string values into lower-case to compare the length
		str1 = str2.toLowerCase();
		str1 = str2.toLowerCase();

		// if the length of both string values are not equal then it will return false
		if (str1.length() != str2.length()) {
			return false;
		}

		// converted the string values into character array to sort them
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		// used equals method to check both the char are equal
		return Arrays.equals(char1, char2);
	}

	public static void main(String[] args) {

		// Declared and initialized string values that i need to check whether
		// the given string values are anagrams or not
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word>> ");
		String str1 = scan.nextLine();

		System.out.println("Enter second word>> ");
		String str2 = scan.nextLine();

		// anagrams method is called and verified whether the given value is anagram or
		// not using if else loop.
		if (anagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}

}

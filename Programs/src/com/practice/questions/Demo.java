package com.practice.questions;

import java.util.Arrays;

public class Demo {

	public static boolean anagrams(String s1, String s2) {
		
		//converted string values into lower-case to compare the length 
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		//if the length of both string values are not equal then it will return  false
		if (s1.length() != s2.length()) {
			return false;
		}
		
		//converted the string values into character array to sort them
		char[] char1 = s1.toCharArray();
		char[] char2 = s1.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);
		
		//used equals method to check both the char are equal
		return Arrays.equals(char1, char2);
	}

	public static void main(String[] args) {
		
		//Declared and initialized string values that i need to check whether 
		//the given string values are anagrams or not
		String s1 = "listen";
		String s2 = "silent";
		
		//anagrams method is called and verified whether the given value is anagram or not using if else loop.
		if (anagrams(s1, s2)) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

}

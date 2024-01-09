package com.practice.questions.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Second_LargestNo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array >> ");
		int arr = scan.nextInt();

		int[] numbers = new int[arr];

		System.out.println("Enter the elements in an array >> ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		Arrays.sort(numbers);

		int secondLargest = numbers[numbers.length - 2];
		// Consider the length of array is 5 and the first element of array
		// is stored at 0th index so there are 5 element so 5-2 is 3 and 3rd element is
		// stored at
		// 4th index so the second last number is printed and second last element is
		// second last large number

		System.out.println("Second largest number: " + secondLargest);
	}

}

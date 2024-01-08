package com.practice.questions.day1;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array >> ");
		int arr = scan.nextInt();

		int[] array = new int[arr];

		int maxNum = array[0];
		System.out.println("Enter the elements of the array >>");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
			if (array[i] > maxNum) {
				maxNum = array[i];
			}
		}
		System.out.println("Largest number is >> " + maxNum);

	}

}

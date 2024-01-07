package com.practice.questions;

public class LargestNo {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 20, 50, 90, 70, 11 };

		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Largest number is >> " + max);

	}

}

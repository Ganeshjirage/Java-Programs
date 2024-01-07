package com.practice.questions;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number>>");
		int number = scan.nextInt();
		
		Demo1 demo = new Demo1();
		int i = number;
		if(i%2==0) {
			System.out.println("the number is even");
		}else {
			System.out.println("The number is not even");
		}

	}

}

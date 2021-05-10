package com.java.masterclass.practice;

import java.util.Scanner;

public class CalculatePowerofNumber {

	static int num1; // 2
	static int num2; // 4
	static int product = 1;
	// static int temp;

	public static void main(String[] args) {

		enterNumbers();

		for (; num2 != 0; --num2) {
			// 2*2*2*2
			product *= num1;
		}
		System.out.println("Power is " + product);

	}

	private static void enterNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		num1 = sc.nextInt();

		System.out.println("Enter number2");
		num2 = sc.nextInt();
	}

}

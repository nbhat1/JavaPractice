package com.java.masterclass.practice;

import java.util.Scanner;

public class Factorial {

	static int num;
	static int fact = 1;

	public static void main(String[] args) {

		num = enterNumber();
		caulculateFactorial();
	}

	private static void caulculateFactorial() {
		for (int i = 1; i <= num; i++) {
			System.out.println("Factorial is " + i);
			fact = fact * i;
		}
		System.out.println("final Factorial is " + fact);
	}

	private static int enterNumber() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		return num;
	}

}

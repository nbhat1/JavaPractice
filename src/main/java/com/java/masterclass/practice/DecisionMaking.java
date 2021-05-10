package com.java.masterclass.practice;

import java.util.Scanner;

public class DecisionMaking {

	static int num1;
	static int num2;
	static int num3;
	static int productResult;

	public static void main(String[] args) {
		enterNumbers();

		doMultiplication();

		showResult();

	}

	private static void showResult() {
		System.out.println("Multiplication result = " + productResult);
	}

	private static void doMultiplication() {
		productResult = num1 * num2 * num3;
	}

	private static void enterNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1");
		num1 = sc.nextInt();

		System.out.println("Enter Number2");
		num2 = sc.nextInt();

		System.out.println("Enter Number3");
		num3 = sc.nextInt();
	}

}

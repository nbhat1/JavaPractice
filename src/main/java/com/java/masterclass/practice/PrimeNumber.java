package com.java.masterclass.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num, count = 0;
		num = enterNumber();
		calculatePrime(num, count);

	}

	private static int enterNumber() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		return num;
	}

	private static void calculatePrime(int num, int count) {
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}

}

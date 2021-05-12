package com.testing.java.core;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 25;

		boolean isPrime = false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				System.out.println(num + " is not prime number");
				isPrime = false;
				break;
			}
			if (isPrime = true) {
				System.out.println(num + " is prime number");
			}
		}

	}

}

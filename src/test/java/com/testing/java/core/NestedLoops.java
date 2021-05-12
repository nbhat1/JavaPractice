package com.testing.java.core;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				for (int k = 1; k <= 10; k++) {
					System.out.println("Value of i: " + i + " && value of j:" + j + " && value of k:" + k);
				}
				System.out.println("***************************************************");

			}
		}
	}
}

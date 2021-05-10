package com.java.masterclass.practice;

import java.util.Scanner;

public class Pattern {

	static int num;
	static int product;
	static int i;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

}

package com.java.masterclass.practice;

import java.util.Scanner;

public class NumberPalindrome {

	static int num;

	public static void main(String[] args) {

		int reversenum = 0;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		temp = num;
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;

		}
		System.out.println("Reversed Number: " + reversenum);

		if (temp == reversenum) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

	}
}

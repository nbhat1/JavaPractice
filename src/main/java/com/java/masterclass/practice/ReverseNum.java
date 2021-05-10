package com.java.masterclass.practice;

import java.util.Scanner;

public class ReverseNum {

	static int num;

	public static void main(String[] args) {

		int reversenum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();

		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;

		}
		System.out.println("Reversed Number: " + reversenum);

	}

}

package com.java.masterclass.practice;

import java.util.Scanner;

public class SwitchCase {

	/* Take day number at run time between 1-7 & print day name */

	static int day;

	public static void main(String[] args) {
		enterDayNumber();

		checkDay();

	}

	public static void checkDay() {
		switch (day) {
		case 1:
			System.out.println("Day is monday ");
			break;
		case 2:
			System.out.println("Day is Tuesday ");
			break;
		case 3:
			System.out.println("Day is Wednesday ");
			break;
		case 4:
			System.out.println("Day is Thursday ");
			break;
		case 5:
			System.out.println("Day is Friday ");
			break;
		case 6:
			System.out.println("Day is Saturday ");
			break;
		case 7:
			System.out.println("Day is Sunday ");
			break;

		default:
			System.out.println("Invalid day entered, value should be betwwen 1 - 7");
		}
	}

	public static void enterDayNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered a number ");
		day = sc.nextInt();
	}

}

package com.java.masterclass.practice;

import java.util.Scanner;

public class SwicthCaseWithString {

	static String month;
	static int monthNbr;
	static Scanner sc;

	public static void main(String[] args) {

		findMonthByName();

		findMonthByNumber();

	}

	public static void findMonthByNumber() {

		System.out.println("Enter month number");
		monthNbr = sc.nextInt();
		switch (monthNbr) {
		case 1:
			System.out.println("Month is January");
			break;
		case 2:
			System.out.println("Month is February");
			break;
		case 3:
			System.out.println("Month is March");
			break;
		case 4:
			System.out.println("Month is April");
			break;
		case 5:
			System.out.println("Month is May");
			break;
		case 6:
			System.out.println("Month is June");
			break;
		case 7:
			System.out.println("Month is July");
			break;
		case 8:
			System.out.println("Month is August");
			break;
		case 9:
			System.out.println("Month is September");
			break;
		case 10:
			System.out.println("Month is October");
			break;
		case 11:
			System.out.println("Month is November");
			break;
		case 12:
			System.out.println("Month is December");
			break;

		default:
			System.out.println("Incorrect month entered");
		}
	}

	public static Scanner findMonthByName() {
		sc = new Scanner(System.in);
		System.out.println("Enter month name");
		month = sc.next();

		switch (month) {
		case "jan":
			System.out.println("Month is January");
			break;
		case "feb":
			System.out.println("Month is February");
			break;
		case "mar":
			System.out.println("Month is March");
			break;
		case "apr":
			System.out.println("Month is April");
			break;
		case "may":
			System.out.println("Month is May");
			break;
		case "jun":
			System.out.println("Month is June");
			break;
		case "jul":
			System.out.println("Month is July");
			break;
		case "aug":
			System.out.println("Month is August");
			break;
		case "sep":
			System.out.println("Month is September");
			break;
		case "oct":
			System.out.println("Month is October");
			break;
		case "nov":
			System.out.println("Month is November");
			break;
		case "dec":
			System.out.println("Month is December");
			break;

		default:
			System.out.println("Incorrect month entered");
		}
		return sc;
	}

}

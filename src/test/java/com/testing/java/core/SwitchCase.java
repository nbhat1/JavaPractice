package com.testing.java.core;

import org.testng.annotations.Test;

public class SwitchCase {

	public static void main(String[] args) {
		int x = 2;

		switch (x) {
		case 1:
			System.out.println("Value of x is 1");
			break;
		case 2:
			System.out.println("Value of x is 2");
			break;
		case 3:
			System.out.println("Value of x is 3");
			break;
		default:
			System.out.println("Value of x is other than 1,2,3");
			break;
		}
	}

	@Test
	public void charSwitch() {

		char x = 'D';
		switch (x) {
		case 'a':
			System.out.println("Value of x is a");
			break;
		case 'A':
			System.out.println("Value of x is A");
			break;
		case 'b':
			System.out.println("Value of x is b");
			break;
		case 'B':
			System.out.println("Value of x is B");
			break;
		case 'c':
			System.out.println("Value of x is c");
			break;
		case 'C':
			System.out.println("Value of x is C");
			break;
		case 'd':
			System.out.println("Value of x is d");
			break;
		case 'D':
			System.out.println("Value of x is D");
			break;
		default:
			System.out.println("Value of x is not defined");
		}
	}

}

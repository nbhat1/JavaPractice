package com.testing.java.core;

public class AssignmentOperator {

	public static void main(String[] args) {
		int x = 5;

		x += 7; // x = x+7 = 5 +7 = 12
		System.out.println(x);

		x -= 3; // x = x-3 = 12 -3 = 9
		System.out.println(x);

		x *= 2; // x = x*2 = 9 *2 =18
		System.out.println(x);

		x /= 5; // x = x*2 = 18/5 = 3 (Only quotient)
		System.out.println(x);

		x %= 2; // x = x*2 = 3 % 2 = 1 (Only Reminder)
		System.out.println(x);
	}

}

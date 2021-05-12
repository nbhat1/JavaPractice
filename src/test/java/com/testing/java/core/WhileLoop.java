package com.testing.java.core;

public class WhileLoop {

	public static void main(String[] args) {

		int x = 3;
		int y = 4;

		/*
		 * while (x < 7) { System.out.println("Before" + x); x++; }
		 */

		while (x < 7 && y < 9) {

			x++;
			y++;
			System.out.println("Before" + x);
			System.out.println("Before" + y);
		}
	}

}

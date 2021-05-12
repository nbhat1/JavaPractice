package com.testing.java.core;

import org.testng.annotations.Test;

/*@author - https://www.udemy.com/course/java-free/learn/lecture/7413206#questions*/

public class TernaryOperator {

	/*
	 * Ternary operator are used to evaluate if a given condition is satisfied. it
	 * has an structure like "Condition to evaluate"? "value if condition is true" :
	 * "value1 if condition is false"
	 */
	public static void main(String[] args) {
		boolean x;
		int y = 5;
		int z = 4;
		x = (y > z) ? true : false;
		System.out.println(x);
	}

	@Test
	public void ternary() {
		int x = 3;
		int y = ((x - 1) == 1) ? x : 10;
		System.out.println(y);
	}

}

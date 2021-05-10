package com.testing.practice.old;

public class FindMaxNumber {
	int Number1 = 10;
	int Number2 = 30;
	int Number3 = 40;
	int flag = 0;

	int FindMaxNumber() {
		// Wrtie your code here
		if (Number1 > Number2 && Number1 > Number3) {
			flag = 1;

		} else if (Number2 > Number1 && Number2 > Number3) {
			flag = 2;
		} else {
			flag = 3;
		}

		return flag;
	}

}

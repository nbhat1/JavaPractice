package com.java.masterclass.practice;

import java.util.Scanner;

public class CastingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		add(num1, num2);
		
		//castingInJava();
		
	}

	private static void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum of num1 & num 2 = " + sum);
	}

	private static void castingInJava() {
		double price = 20.0d;
		int intPrice = (int) price;
		System.out.println(intPrice);
		
		/*CastingClass obj = new CastingClass();
		Object myObject = obj;
		
		CastingClass obj1 = (CastingClass) myObject;*/
		
		int num1 = 100;
		int num2 = 101;
		int num3 = 102;
		
		boolean isTrue = num1>num2 || num3>num2;
		System.out.println(isTrue);
	}

}

package com.testing.practice.old;

import java.util.Scanner;

public class checkOddEven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num;
        System.out.println("Please enter number");
        Scanner Input = new Scanner(System.in);
        num = Input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }


    }

}

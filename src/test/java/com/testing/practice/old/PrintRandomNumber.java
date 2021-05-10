package com.testing.practice.old;

import java.util.Random;

public class PrintRandomNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Random randNum = new Random();
        for (int i = 0; i <= 5; i++) {
            System.out.println(randNum.nextInt(100));
        }


    }

}

package com.testing.practice.old;

public class revreseNumberUsingWhileLoop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num = 18;
        int reversenum = 0;

        while (num != 0) {
            reversenum = reversenum * 10;
            System.out.println(reversenum);
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        System.out.println("reverse number is " + reversenum);

    }

}

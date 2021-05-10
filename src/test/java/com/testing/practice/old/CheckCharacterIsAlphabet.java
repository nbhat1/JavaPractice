package com.testing.practice.old;

import java.util.Scanner;

public class CheckCharacterIsAlphabet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("This is a alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("This is a number");
        } else {
            System.out.println("This is a special character");
        }
    }
}

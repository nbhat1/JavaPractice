package com.testing.practice.old;

public class CheckMobileNumber {

    public static boolean checkIfNumber(String Input) {

        try {
            Integer.parseInt(Input);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String number = "123459865";

        if (checkIfNumber(number) && number.length() == 10) {
            System.out.println("Number is valid & 10 digit");
        } else {
            System.out.println("Number is valid but not 10 digit");
        }

    }

}

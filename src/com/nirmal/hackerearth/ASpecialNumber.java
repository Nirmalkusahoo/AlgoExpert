package com.nirmal.hackerearth;

import java.util.Scanner;

public class ASpecialNumber {

    public static void main(String args[]) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);
        int testCase = Integer.parseInt(s.nextLine());
        // Write your code here
        for (int i = 1; i <= testCase; i++) {
            int number = Integer.parseInt(s.nextLine());
            printSpecialNumber(number);
        }
    }


    public static void printSpecialNumber(int number) {
        for (int i = number; i <= number + 100; i++) {

            int sum = findSum(i);
            if (sum % 4 == 0) {
                System.out.println(i);
                break;
            }
        }
    }


    public static int findSum(int number) {
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }

        return sum;
    }


}

package com.company;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumber(sc.nextInt());
    }

    public static void printNumber(int num) {
        if (num > 0) {
            printNumber(num / 10);
            System.out.println(num % 10);
        }
    }
}


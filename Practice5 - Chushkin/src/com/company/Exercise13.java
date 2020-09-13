package com.company;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num != 0) {
            System.out.println(num);
            if (sc.nextInt() != 0) printOddNumbers();
        }
    }
}

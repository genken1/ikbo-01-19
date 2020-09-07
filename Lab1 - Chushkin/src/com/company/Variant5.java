package com.company;

public class Variant5 {
    public static void main(String[] args) {
        System.out.println(countFactorial(-123));
        System.out.println(countFactorial(0));
        System.out.println(countFactorial(1));
        System.out.println(countFactorial(2));
        System.out.println(countFactorial(3));
        System.out.println(countFactorial(4));
        System.out.println(countFactorial(5));
        System.out.println(countFactorial(6));
        System.out.println(countFactorial(7));
        System.out.println(countFactorial(9));
        System.out.println(countFactorial(10));
    }

    public static int countFactorial(int num) {
        int r = 1;
        while (num > 0) {
            r *= num;
            num--;
        }
        return num == 0 ? r : -1;
    }
}

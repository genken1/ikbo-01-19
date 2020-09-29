package com.company;

/**
 * Полуим java.lang.ArithmeticException.
 * Если 2.0 / 0.0 получаем бесконечность.
 */
public class Exercise1 {

    public static void main(String[] args) {
        exceptionDemo();
    }
    public static void exceptionDemo() {
        System.out.println(2 / 0);
    }

}

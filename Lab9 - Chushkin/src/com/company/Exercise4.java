package com.company;

import java.util.Scanner;

/**
 * Qwerty 0 1.2 1
 *
 * Блок final выполнится в любом случае.
 */
public class Exercise4 {
    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Неправильный формат ввода.");
        } finally {
            System.out.println("Вы ввели " + intString);
        }
    }
}

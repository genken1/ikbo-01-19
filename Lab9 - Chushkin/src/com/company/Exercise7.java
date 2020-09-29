package com.company;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        try {
            getKey();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Вы ввели пустую строку");
        }
    }

    public static void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails(key);
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}

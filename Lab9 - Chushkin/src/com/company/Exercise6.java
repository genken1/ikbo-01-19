package com.company;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        getKey();
    }

    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails(String key) {
        if (key == "") {
            try {
                throw new Exception("Key set to empty string");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "data for " + key;
    }
}

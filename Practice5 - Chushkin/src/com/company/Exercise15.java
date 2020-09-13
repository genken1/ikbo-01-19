package com.company;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseNumber(sc.nextInt());
    }
    public static void reverseNumber(int num){
        if(num > 0){
            System.out.println(num % 10);
            reverseNumber(num / 10);
        }
    }
}


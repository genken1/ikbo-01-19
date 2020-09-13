package com.company;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        int count = 0;
        do {
            num = sc.nextLine();
            for(int i = 0; i < num.length(); i++){
                if(num.charAt(i) == '1') count++;
            }
        }while(!num.equals("00"));
        System.out.println(count);
    }
}

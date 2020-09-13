package com.company;

import java.util.Arrays;

public class Variant4 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) != arr.length) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println(arr[i]);
            }
        }

        Arrays.sort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}

package com.company.Exercise3;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 43, 23, 2};
        MergerSort.sort(arr, 0, arr.length);
        System.out.println(arr.toString());
    }
}

package com.company;

public class Variant1 {
    static int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int answer = 0;
        int[] arr;

        arr = getArray(ARRAY_SIZE);

        for (int i : arr) answer += i;
        System.out.print(answer);
    }

    public static int[] getArray(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        return arr;
    }
}

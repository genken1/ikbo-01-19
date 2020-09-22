package com.company.Exercise2;


import com.company.Student;

public class QuickSort {

    public static int partition(Student[] arr, int left, int right) {
        Student pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j].getMarks() < pivot.getMarks()) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void sort(Student[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            sort(arr, left, pivot-1);
            sort(arr, pivot+1, right);
        }
    }

    public static void swap(Student[] arr, int i, int j) {
        Student tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

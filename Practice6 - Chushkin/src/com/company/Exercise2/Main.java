package com.company.Exercise2;

import com.company.Student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student[] st = new Student[10];
        for(int i=0; i<st.length; i++){
            st[i] = new Student((int)(Math.random()*100));
        }
        System.out.println("Sorting by QuickSort:");
        QuickSort.sort(st, 0, st.length-1);
        for(Student e : st) System.out.println(e);

        Arrays.sort(st, new SortingStudentsByGPA());
        System.out.println("\nSorting by gpa:");
        for(Student e : st) System.out.println(e);
    }
}

package com.company.Exercise2;

import com.company.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getMarks(), o2.getMarks());
    }
}

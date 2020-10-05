package com.company;

public class Student implements Comparable<Student>{
    private int marks;

    public Student(){}

    public Student(int marks){
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getMarks(), getMarks());
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }
}

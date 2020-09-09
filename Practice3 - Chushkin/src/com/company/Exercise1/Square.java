package com.company.Exercise1;

public class Square extends Shape {
    double length = 0;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double countPerimeter() {
        return 4 * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

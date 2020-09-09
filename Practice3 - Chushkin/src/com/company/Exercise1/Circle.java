package com.company.Exercise1;

public class Circle extends Shape {
    double rad = 0;

    public Circle() {
    }

    public Circle(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public double countPerimeter() {
        return 2 * Math.PI + rad;
    }
}

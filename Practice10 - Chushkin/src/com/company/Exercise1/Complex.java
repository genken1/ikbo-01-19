package com.company.Exercise1;

public class Complex {
    private int x, y;

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Complex(){}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

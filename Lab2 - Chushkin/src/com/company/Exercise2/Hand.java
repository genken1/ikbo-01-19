package com.company.Exercise2;

public class Hand {
    private int amountFinger;
    private float length;

    public Hand(){
        amountFinger = -1;
        length = -1;
    }

    public Hand(int amountFinger, float length) {
        this.amountFinger = amountFinger;
        this.length = length;
    }

    public int getAmountFinger() {
        return amountFinger;
    }

    public void setAmountFinger(int amountFinger) {
        this.amountFinger = amountFinger;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "amountFinger=" + amountFinger +
                ", length=" + length +
                '}';
    }
}

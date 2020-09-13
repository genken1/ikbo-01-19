package com.company.Exercise2;

public class Leg {
    private float weight;
    private float length;
    private boolean walking;

    public Leg() {
        weight = -1;
        length = -1;
        walking = false;
    }

    public Leg(float weight, float length, boolean walking) {
        this.weight = weight;
        this.length = length;
        this.walking = walking;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public boolean isWalking() {
        return walking;
    }

    public void setWalking(boolean walking) {
        this.walking = walking;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "weight=" + weight +
                ", length=" + length +
                ", walking=" + walking +
                '}';
    }
}

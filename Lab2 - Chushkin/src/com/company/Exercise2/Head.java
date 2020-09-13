package com.company.Exercise2;

public class Head {
    private String color;
    private float radius;

    public Head(){
        color = "default";
        radius = -1;
    }

    public Head(String color, float radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Head{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}

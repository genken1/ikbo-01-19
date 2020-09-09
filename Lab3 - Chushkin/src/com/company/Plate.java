package com.company;

public class Plate extends Dish {
    private int radius;

    public Plate() {
    }

    public Plate(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFragility() {
        return super.isFragility();
    }

    @Override
    public void setFragility(boolean fragility) {
        super.setFragility(fragility);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String formShape() {
        return "circle";
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                '}';
    }
}

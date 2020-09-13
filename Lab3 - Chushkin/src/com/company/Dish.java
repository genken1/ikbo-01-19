package com.company;

public abstract class Dish {
    private String name;
    private String color;
    private boolean fragility;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFragility() {
        return fragility;
    }

    public void setFragility(boolean fragility) {
        this.fragility = fragility;
    }

    public abstract String formShape();

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", fragility=" + fragility +
                '}';
    }
}

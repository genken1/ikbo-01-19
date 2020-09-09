package com.company;

public class Tray extends Dish {
    private int amountPlate;

    public Tray() {
    }

    public Tray(int amountPlate) {
        this.amountPlate = amountPlate;
    }

    public Tray(String name, String color, boolean fragility, int amountPlate){
        super.setName(name);
        super.setColor(color);
        super.setFragility(fragility);
        this.amountPlate = amountPlate;
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

    public int getAmountPlate() {
        return amountPlate;
    }

    @Override
    public String formShape() {
        return "ellipse";
    }

    @Override
    public String toString() {
        return super.toString()+ "Tray{" +
                "amountPlate=" + amountPlate +
                '}';
    }
}

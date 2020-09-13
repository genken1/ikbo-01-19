package com.company;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate(2);
        Tray tray = new Tray(3);
        Dish tray1 = new Tray("tray", "silver", false, 4);

        plate.setColor("white");
        plate.setFragility(true);
        plate.setName("plate");

        System.out.println(plate.getRadius() + " " + plate.getName() + " " + plate.getColor() + plate.formShape());
        System.out.println(tray.getAmountPlate() + " " + tray.formShape());
        System.out.print(tray1);
    }
}

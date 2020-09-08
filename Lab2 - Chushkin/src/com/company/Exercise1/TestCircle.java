package com.company.Exercise1;

public class TestCircle {
    public static void main(String[] args) {
        Circle cr = new Circle(2, 0,0);
        System.out.println(cr.toString());

        Circle cr2 = new Circle();
        cr2.setRadius(23);
        cr2.setX(3.4);
        cr2.setY(23.9097);
        System.out.print(cr2.getX() +" "+cr2.getY() + cr2.getRadius() +" "+cr2.getLength());
    }
}

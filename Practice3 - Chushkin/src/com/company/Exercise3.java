package com.company;

import com.company.Exercise2.*;

public class Exercise3 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        /*upcasting - восходящее преобразование
         * т.е. мы оперируем только методами класса Shape*/
        // System.out.println(s1.getRadius());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        /* Невозможно создать объект абстрактного класса
         * т.к. абстрактный класс служит только для использования
         * в качестве класса родиетля */
        // Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        /*upcasting. Данного метода не сущ.
         * в классе Shape*/
        // System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        /*upcasting*/
        // System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        /*Downcasting - нисходящее преобразование
         * Используем только методы класса Rectangle
         * преобразование отработало без ошибок,
         * т.к. s4 - объект класса Shape ссылающийся на класс Square*/
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

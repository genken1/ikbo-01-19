package com.company;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog( 3);
        Dog d3 = new Dog(15, "Bob");
        Tester.printInfo(d1, d2, d3);
        d1.setAge(23);
        d1.setName("Chop");
        Tester.printInfo(d1, d2, d3);
        System.out.print("\nDog №3 is "+d3.getName()+" and age - "+d3.getAge());
    }
}

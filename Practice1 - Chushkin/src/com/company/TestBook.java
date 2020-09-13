package com.company;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Finance");
        Book b3 = new Book("Daniel Defoe", "Robinson Crusoe");
        Tester.printInfo(b1, b2, b3);
        b1.setName( "Gulliver’s Travels");
        b1.setAuthor("Jonathan Swift");
        System.out.print(b1.getName()+" by "+b1.getAuthor());
    }
}

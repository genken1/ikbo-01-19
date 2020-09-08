package com.company.Exercise3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Pushkin", "Ruslan and Ludmila", 1820, 5);
        System.out.println(book.toString());

        Book book2 = new Book();
        book.setName("The Menagerie");
        book2.setAuthor("Arthur Conan Doyl");
        book2.setYear(1211);
        book2.setAmountStar(10);
        System.out.println(book2.getName()+" "+book2.getAuthor()+" "+book2.getYear()+" "+book2.getAmountStar());
    }
}

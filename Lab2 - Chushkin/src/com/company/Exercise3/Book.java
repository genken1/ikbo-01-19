package com.company.Exercise3;

public class Book {
    private String author;
    private String name;
    private int year;
    private int amountStar;

    public Book(){}

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public Book(String author, String name, int year, int amountStar) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.amountStar = amountStar;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountStar() {
        return amountStar;
    }

    public void setAmountStar(int amountStar) {
        this.amountStar = amountStar;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", amountStar=" + amountStar +
                '}';
    }
}

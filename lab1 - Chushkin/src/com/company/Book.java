package com.company;

public class Book {
    public String author;
    private String name;

    public Book(){
        author = "no name";
        name = "unavailable";
    }
    public Book(String name){
        author = "no name";
        this.name = name;
    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
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


    @Override
    public String toString() {
        return "<"+name+">"+" by " + author;
    }
}

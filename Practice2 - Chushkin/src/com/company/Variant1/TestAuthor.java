package com.company.Variant1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Oleg", "something@gmail.com", 'M');
        System.out.println(author.toString());
        author.setEmail("nothingwrong@gmail.com");
        System.out.print(author.getName() + ", "+ author.getEmail()+", "+author.getGender());
    }
}

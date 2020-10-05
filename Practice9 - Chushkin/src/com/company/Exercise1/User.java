package com.company.Exercise1;

public class User {
    private final String name;
    private final String lastName;
    private final String patronymic;
    private final String inn;

    public User(String name, String patronymic, String lastName, String inn) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getInn() {
        return inn;
    }
}

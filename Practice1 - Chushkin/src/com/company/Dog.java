package com.company;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        age = 0;
        name = "default";
    }

    public Dog(int age) {
        this.age = age;
        name = "default";
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog name - " + name + ", age - " + age;
    }
}

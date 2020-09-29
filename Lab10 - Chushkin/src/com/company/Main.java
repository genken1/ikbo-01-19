package com.company;

public class Main {
    public static void main(String[] args) {
        ObjectSaver saver = new ObjectSaver(10);
        for (int i = 0; i < saver.getSize() - 1; i++) {
            saver.add(i);
        }
        saver.add("dwedew");
        System.out.println(saver);
        saver.add('d');
        System.out.println(saver.get(10));
    }
}

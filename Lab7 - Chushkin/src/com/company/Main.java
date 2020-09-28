package com.company;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        for (int i = 0; i <10; i++) {
            list.add(i);
        }
        list.add(1, 13);
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list.getSize());
        for (int i = 0; i <10; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}

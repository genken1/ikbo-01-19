package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //BoundedWaitList
        int size = 5;
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<Integer>(size);
        for (int i = 0; i < size; i++) boundedWaitList.add(i);
        System.out.println("BoundedWaitList:");
        System.out.println("capacity = " + boundedWaitList.getCapacity());

        //UnfairWaitList
        System.out.println("\nUnfairWaitList");
        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<String>();
        for (Integer i = 0; i < 10; i++) unfairWaitList.add(i.toString());
        System.out.println(unfairWaitList.toString());
        unfairWaitList.remove("2");
        System.out.println(unfairWaitList.toString());
        unfairWaitList.moveToBack("0");
        System.out.println(unfairWaitList.toString());

        //WaitList
        System.out.println("\nWaitList");
        WaitList<Integer> list = new WaitList<>();
        for (int i = 0; i < size; i++) list.add(i);
        System.out.println(list.toString());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(2));
        list.remove();
        System.out.println(list.toString());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        System.out.println(list.containsAll(arr));
        arr.add(7);
        System.out.println(list.containsAll(arr));
    }
}

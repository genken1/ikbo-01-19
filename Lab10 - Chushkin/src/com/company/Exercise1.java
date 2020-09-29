package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"qwerty", "funny"};

        List list1 = converter(intArr);
        List list2 = converter(strArr);

        for(Object i : list1) System.out.print(i + " ");
        System.out.println();
        for(Object i : list2) System.out.print(i + " ");

    }

    public static <E> List<E> converter(E[] arr){
        List<E> list = new ArrayList<>();
        for(Object i : arr) list.add((E) i);

        return list;
    }
}

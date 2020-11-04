package com.company;

import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d\\s*\\+");
        String[] tests = {
                "(1 + 8) – 9 / 4",
                "6 / 5 – 2 * 9 "
        };
        for (String test : tests)
            System.out.println(pattern.matcher(test).find() + ":\t" + test);
    }
}

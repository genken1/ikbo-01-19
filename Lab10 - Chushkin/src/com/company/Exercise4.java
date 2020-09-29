package com.company;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class Exercise4 {
    private static final String PATH = "src/com/company";

    public static void main(String[] args) {
        List<File> list = getDirs(new File(PATH));

        for (int i = 0; i < list.size() && i < 5; i++) {
            System.out.println(list.get(i).getName());
        }
    }

    public static List<File> getDirs(File dir) {
        return Exercise1.converter(Objects.requireNonNull(dir.listFiles()));
    }
}

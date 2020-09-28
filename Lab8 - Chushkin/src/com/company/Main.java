package com.company;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReaderWriter file = new FileReaderWriter("D:\\GitHub\\ikbo-01-19\\Lab8 - Chushkin\\src\\notes3.txt");
        file.write(false);
        file.printFile();
        file.write(true);
        file.printFile();
    }
}

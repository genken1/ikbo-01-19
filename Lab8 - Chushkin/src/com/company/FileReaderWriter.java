package com.company;

import java.io.*;
import java.util.Scanner;

public class FileReaderWriter {
    private String path;

    public FileReaderWriter(String path){
        this.path = path;
    }

    public void write(boolean add){
        try {
            FileWriter writer = new FileWriter(path, add);
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            writer.write(text);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public void writeExtra() throws IOException {
        try {
            writer = new FileWriter(path, false);
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            BufferedWriter bw = new BufferedWriter(writer);
            bw.append(text);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            writer.close();
        }
    }*/

    public void printFile() throws FileNotFoundException {
        FileReader reader = new FileReader(path);
        try {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int amount = 20;

        String shapes[] = {"Square", "Circle", "Ellipse"};

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(4, 5));
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        for(int i = 0; i<amount; i++)
            frame.add(new DynamicShapes(shapes[(int) (Math.random()*3)]));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DynamicShapes extends JPanel{

    private List<Shape> shapes = new ArrayList<>();
    private Random random = new Random(System.currentTimeMillis());

    public DynamicShapes(String shape) {
        setBackground(Color.GREEN);
        setPreferredSize(new Dimension(400, 400));

        switch (shape) {
            case "Circle":
                // addCircle(Color.GRAY, 390, 390);
                addCircle(Color.GRAY, 0, 0);
                break;
            case "Square":
                // addSquare(Color.BLUE, 380, 380);
                addSquare(Color.BLUE, 0, 0);
                break;
            case "Ellipse":
                // addEllipse(Color.BLUE, 380, 380);
                addEllipse(Color.BLUE, 0, 0);
                break;
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            // getRootPane().setBackground(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()));
            // setBackground(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()));
            s.setColor(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()));
            s.draw(g);
        }
    }

    public void addCircle(Color color, int maxX, int maxY) {
        shapes.add(new Circle(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), maxX, maxY));
    }

    public void addSquare(Color color, int maxX, int maxY) {
        shapes.add(new Square(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), maxX, maxY));
    }

    public void addEllipse(Color color, int maxX, int maxY) {
        shapes.add(new Ellipse(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), maxX, maxY));
    }
}

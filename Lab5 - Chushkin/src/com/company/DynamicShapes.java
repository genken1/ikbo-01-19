package com.company;

import javax.swing.*;
import java.awt.*;
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
                addCircle(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), 0, 0);
                break;
            case "Square":
                addSquare(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), 0, 0);
                break;
            case "Ellipse":
                addEllipse(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), 0, 0);
                break;
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.setColor(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()));
            s.draw(g);
        }
    }

    public void addCircle(Color color, int maxX, int maxY) {
        shapes.add(new Circle(color, maxX, maxY));
    }

    public void addSquare(Color color, int maxX, int maxY) {
        shapes.add(new Square(color, maxX, maxY));
    }

    public void addEllipse(Color color, int maxX, int maxY) {
        shapes.add(new Ellipse(color, maxX, maxY));
    }
}

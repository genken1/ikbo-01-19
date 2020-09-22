package com.company;

import java.awt.*;

public abstract class Shape {
    private Color color;

    private double xPosition;
    private double yPosition;

    public Shape(Color color, double xPosition, double yPosition) {
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public abstract void draw(Graphics g);

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getxPosition() {
        return xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }
}

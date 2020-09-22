package com.company;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends Shape{
    public Ellipse(Color color, double xPosition, double yPosition) {
        super(color, xPosition, yPosition);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D.Double ellipse = new Ellipse2D.Double(getxPosition(), getyPosition(), 30, 50);

        graphics2D.setColor(getColor());
        graphics2D.fill(ellipse);
    }
}

package com.company;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{
    public Circle(Color color, /*String colorName,*/ int x, int y) {
        super(color, /*colorName,*/ x, y);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(getxPosition(), getyPosition(), 40, 40);

        g2d.setColor(getColor());
        g2d.fill(circle);
    }

}

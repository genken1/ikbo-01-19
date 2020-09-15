package com.company;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Shape{
    public Square(Color color, /*String colorName,*/ double xPosition, double yPosition) {
        super(color,/* colorName,*/ xPosition, yPosition);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Double(getxPosition(), getyPosition(), 60, 60);

        graphics2D.setColor(getColor());
        graphics2D.fill(rect);
    }
}

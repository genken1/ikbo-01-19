package com.company.Variant2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball.toString());
        ball.setX(23);
        ball.setY(14);
        ball.move(1.4, 1.5);
        System.out.println(ball.getX()+" "+ball.getY());
        Ball ball2 = new Ball(1, 2);
        System.out.println(ball2);
        ball2.setXY(3.54, 4.342);
        System.out.print(ball2);
    }
}

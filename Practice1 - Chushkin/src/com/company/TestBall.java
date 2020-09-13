package com.company;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(true);
        Ball b3 = new Ball(3.2f);
        Ball b4 = new Ball(3.2f, true);

        Tester.printInfo(b1, b2, b3);
        b4.setJump(false);
        b4.setRadius(2);
        System.out.println(b4.getRadius()+" " + b4.isJump()+" "+ b4.getDiameter());
    }
}

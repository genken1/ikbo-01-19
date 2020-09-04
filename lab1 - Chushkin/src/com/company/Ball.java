package com.company;

public class Ball {
    private float radius;
    private boolean jump;

    public Ball() {
        jump = false;
        radius = -1;
    }

    public Ball(boolean jump) {
        this.jump = jump;
    }

    public Ball(float radius) {
        this.radius = radius;
    }

    public Ball(float radius, boolean jump) {
        this.radius = radius;
        this.jump = jump;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public float getDiameter(){
        return radius > 0 ? radius*2 : -1;
    }

    @Override
    public String toString() {
        return "Ball jump is "+ jump + ", radius = "+radius;
    }
}

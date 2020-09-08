package com.company.Exercise2;

public class Human {
    private int amountChild;
    private Leg leg;
    private Hand hand;
    private Head head;

    public Human(){}

    public Human(Leg leg, Hand hand, Head head, int amountChild) {
        this.leg = leg;
        this.hand = hand;
        this.head = head;
        this.amountChild = amountChild;
    }

    public int getAmountChild() {
        return amountChild;
    }

    public void setAmountChild(int amountChild) {
        this.amountChild = amountChild;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Human{" +
                "amountChild=" + amountChild +
                ", leg=" + leg +
                ", hand=" + hand +
                ", head=" + head +
                '}';
    }
}

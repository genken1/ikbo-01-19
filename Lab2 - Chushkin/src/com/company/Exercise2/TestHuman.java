package com.company.Exercise2;

public class TestHuman {
    public static void main(String[] args) {
        Leg leg = new Leg(3.4f, 0.9f, true);
        Hand hand = new Hand(4, 1.2f);
        Head head = new Head("Yellow", 0.4f);

        Human human = new Human(leg, hand, head, 7);

        System.out.println(human.toString());

        Hand hand2 = new Hand(5, 2.3f);
        human.setHand(hand2);
        System.out.print(human.getHand());

    }
}

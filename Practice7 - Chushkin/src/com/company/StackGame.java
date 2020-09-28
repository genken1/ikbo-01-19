package com.company;

import java.util.Scanner;
import java.util.Stack;

public class StackGame extends Game<Stack<Integer>> {
    @Override
    public Stack<Integer> inputVars(Scanner sc) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.add(sc.nextInt());
        }
        return stack;
    }

    @Override
    public int getVar1() {
        return fT.peek();
    }

    @Override
    public int getVar2() {
        return sT.peek();
    }

    @Override
    public boolean isEmpty1() {
        return fT.isEmpty();
    }

    @Override
    public boolean isEmpty2() {
        return sT.isEmpty();
    }

    @Override
    public void swapVar(Stack<Integer> t1, Stack<Integer> t2) {
        t1.insertElementAt(t1.peek(), 0);
        t1.insertElementAt(t2.peek(), 0);
        t1.pop();
        t2.pop();
    }
}

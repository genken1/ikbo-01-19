package com.company;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class QueueGame extends Game<Queue<Integer>>{
    @Override
    public Queue<Integer> inputVars(Scanner sc) {
        Queue<Integer> queue = new LinkedTransferQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.add(sc.nextInt());
        }
        return queue;
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
    public void swapVar(Queue<Integer> t1, Queue<Integer> t2) {
        t1.offer(t1.peek());
        t1.offer(t2.peek());
        t1.remove();
        t2.remove();
    }
}

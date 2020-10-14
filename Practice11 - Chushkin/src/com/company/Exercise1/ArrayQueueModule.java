package com.company.Exercise1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static Object[] elements = new Object[1];

    public static void enqueue(Object element) {
        assert element != null;

        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    public static Object dequeue() {
        if(size>0) {
            Object tmp = elements[0];
            balanceQueue();
            return tmp;
        }
        return new ArrayIndexOutOfBoundsException();
    }

    public static Object element(){
        return size > 0 ? elements[0] : new ArrayIndexOutOfBoundsException();
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    private static void balanceQueue(){
        Object[] tmpElements = new Object[--size];
        System.arraycopy(elements, 1, tmpElements, 0, size);
        elements = tmpElements;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}

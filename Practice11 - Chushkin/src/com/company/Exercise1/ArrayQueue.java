package com.company.Exercise1;

import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private Object[] elements = new Object[1];

    public void enqueue(Object element) {
        assert element != null;

        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    public Object dequeue() {
        if(size>0) {
            Object value = element();
            Object[] tmpElements = new Object[--size];
            System.arraycopy(elements, 1, tmpElements, 0, size);
            elements = tmpElements;
            return value;
        }

        return new ArrayIndexOutOfBoundsException();
    }

    public Object element(){
        return size > 0 ? elements[0] : new ArrayIndexOutOfBoundsException();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}

package com.company.Exercise1;

import java.util.Arrays;

public class ArrayQueueADT {
    private int size;
    private Object[] elements = new Object[10];

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;

        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.size++] = element;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            queue.elements = Arrays.copyOf(queue.elements, 2 * capacity);
        }
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if(queue.size>0) {
            Object value = element(queue);
            Object[] tmpElements = new Object[--queue.size];
            System.arraycopy(queue.elements, 1, tmpElements, 0, queue.size);
            queue.elements = tmpElements;
            return value;
        }

        return new ArrayIndexOutOfBoundsException();
    }

    public static Object element(ArrayQueueADT queue) {
        return queue.size > 0 ? queue.elements[0] : new ArrayIndexOutOfBoundsException();

    }
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }
}

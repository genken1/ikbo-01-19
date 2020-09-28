package com.company;

import java.util.Arrays;

public class ArrayList<T> {
    private final int SIZE = 10;
    private Object[] arr = new Object[SIZE];
    private int actSize = 0;

    private boolean checkSize() {
        return actSize >= arr.length / 2;
    }

    public boolean add(T data) {
        if (checkSize()) {
            increaseSize();
        }
        arr[actSize++] = data;
        return true;
    }

    public void add(int index, T element) {
        if (checkSize()) {
            System.arraycopy(arr, index, arr, index + 1, actSize - index);
            arr[index] = element;
            actSize++;
        }
    }

    private void increaseSize() throws RuntimeException {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }

    public T get(int index) {
        if (index >= actSize) {
            throw new IndexOutOfBoundsException();
        }
        return (T) arr[index];
    }

    public boolean isEmpty() {
        return arr[0] == null;
    }

    public void remove(int index) {
        if (actSize - index >= 0) {
            System.arraycopy(arr, index + 1, arr, index, actSize - index - 1);
        }

        arr[--actSize] = null;
    }

    public int getSize(){
        return actSize;
    }
}

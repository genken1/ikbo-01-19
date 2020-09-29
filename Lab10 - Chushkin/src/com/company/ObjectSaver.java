package com.company;


public class ObjectSaver {
    private int size = 0;
    private final Object[] arr;

    public ObjectSaver(int size) {
        arr = new Object[size];
    }

    public <E> void add(E key) {
        if (size < arr.length)
            arr[size++] = key;
        else throw new IndexOutOfBoundsException("You have size: "+arr.length);
    }

    public Object get(int index){
        if(index< 0 || index<size) return arr[index];
        throw new IndexOutOfBoundsException("Number of element doesn't exist.");
    }

    public int getSize(){
        return arr.length;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Object i : arr) s.append(i).append(" ");
        return String.valueOf(s);
    }
}

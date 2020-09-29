package com.company;

/**
 * @param <E> - generic type
 */
public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    /**
     * @param capacity - capacity of list
     */
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    /**
     * @return capacity of list
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param element to add
     */
    @Override
    public void add(E element) {
        super.add(element);
    }

    /**
     * @return info about list
     */
    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}

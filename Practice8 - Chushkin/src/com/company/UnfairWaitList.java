package com.company;

/**
 * @param <E> - generic type
 */
public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
        super();
    }

    /**
     * @param element which we want to remove
     */
    public void remove(E element) {
        if (content.peek() != element) {
            content.remove(element);
        }
    }

    /**
     * @param element we want to move back
     */
    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }
}

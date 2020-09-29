package com.company;

import java.util.Collection;

/**
 * @param <E> - generic type
 */
public interface IWaitList<E> {
    /**
     * @param element to add
     */
    void add(E element);

    /**
     * @return element which we removed
     */
    E remove();

    /**
     * @param element which we want to check
     * @return is exist
     */
    boolean contains(E element);

    /**
     * @param c contains "c" in all list
     * @return is exist c in list
     */
    boolean containsAll(Collection<E> c);

    /**
     * @return list empty or not
     */
    boolean isEmpty();
}

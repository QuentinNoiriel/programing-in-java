package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/***
 * MyQueue contain methods useful for linked list of type queue
 * @param <E>
 */

public interface MyQueue<E> {
    void enqueue(E x);

    E dequeue();

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    int numOfElems();

    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}

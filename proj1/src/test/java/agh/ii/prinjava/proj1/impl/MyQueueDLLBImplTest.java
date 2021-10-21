package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * We create a Queue composed of Integer and his name is queueOfInts
 * @param <E>
 */
class MyQueueDLLBImplTest<E> {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    /**
     * We create a list of int to test our Queue
     * we print this list (just initial list)
     */
    @BeforeEach
    void setUp() {
        System.out.println("");
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(7);
        queueOfInts.enqueue(4);

        System.out.println("List: "+queueOfInts.toString());
    }

    @AfterEach
    void tearDown() {
        System.out.println("New list: "+queueOfInts.toString());
    }

    /**
     * It's time to know if enqueue works.
     * we print a message which explain that we make an enqueue that is to say add an element at the end
     * to finish we use the method enqueue to add this element at our list
     */
    @Test
    void enqueue(){
        System.out.println("Enqueue the element on the list (at the end of the list): ");
        queueOfInts.enqueue(69);
    }

    /**
     * Like for enqueue we need to do this Test for Dequeue
     *  we print a message which explain that we make a dequeue that is to say remove the first element at our end
     *  o finish we use the method dequeue to remove this element at our list
     */
    @Test
    void dequeue(){
        System.out.println("Dequeue the element on the list (at the start of the list): ");
        queueOfInts.dequeue();
    }
    /**
     * Result : The method enqueue and Dequeue work
     */
}
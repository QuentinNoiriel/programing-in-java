package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * We create a Queue composed of Integer and his name is queueOfInts
 * @param <E>
 */
class MyStackDLLBImplTest<E> {
    MyStack<Integer> stackOfInts = MyStack.create();

    /**
     * We create a list of int to test our Stack
     * we print this list (just initial list)
     */
    @BeforeEach
    void setUp() {
        System.out.println("");

        stackOfInts.push(12);
        stackOfInts.push(47);
        stackOfInts.push(16);
        stackOfInts.push(1);
        stackOfInts.push(87);
        stackOfInts.push(8);

        System.out.println("List: "+stackOfInts.toString());
    }

    @AfterEach
    void tearDown() {
        /* Print the initial list*/
        System.out.println("New list: "+stackOfInts.toString());
    }
    /**
     * It's time to know if pop works.
     * we print a message which explain that we make pop that is to say remove the first element of the list
     * to finish we use the method pop to remove this element at our list
     */
    @Test
    void pop(){
        System.out.println("Pop the element on the list (at the end of the list): ");
        stackOfInts.pop();
    }
    /**
     * Like for pop we need to do this Test for push
     * we print a message which explain that we make a push that is to say add an element at the begginig of our list
     * finish we use the method push to add this element at our list
     */
    @Test
    void push(){
        System.out.println("Push the element on the list (add at the beginnig of the list): ");
        stackOfInts.push(69);
    }
    /**
     * Result : The method pop and push work
     */
}
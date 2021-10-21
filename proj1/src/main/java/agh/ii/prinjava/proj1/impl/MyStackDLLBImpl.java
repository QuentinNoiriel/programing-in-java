package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

/**
 * We create a list of elements that will associated with a stack
 * @param <E>
 */
public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * We use the method pop to remove the first element of our list
     * @return
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     * We use the method push to add an element at the beginnig of our list
     * @param x
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    /**
     * We count the of element to know the height of list and if it's null
     * @return
     */
    @Override
    public int numOfElems() {
        return elems.listLength();
    }

    /**
     * This method return the first element of our list
     * @return
     */
    @Override
    public E peek() {
        return elems.ElemStart();
    }

    /**
     * return the list in list of String
     * @return
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}

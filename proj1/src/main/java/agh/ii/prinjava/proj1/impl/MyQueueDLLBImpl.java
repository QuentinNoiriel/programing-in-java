package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
/**
 * We create a list of elements that will associated with a queue
 * @param <E>
 */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();
    /**
     * We use the method enqueue to remove add an element at the end of our list
     * @return
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }
    /**
     * We use the method dequeue to remove the first element of our list
     * @return
     */
    @Override
    public E dequeue() {
        return elems.removeFirst();
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
     * This method return the last element of our list
     * @return
     */
    @Override
    public E peek() {
        return elems.ElemEnd();
    }
    /**
     * return the list in list on String
     * @return
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}

package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest<E> {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
        dLinkList.addFirst(5);
        dLinkList.addFirst(7);
        dLinkList.addLast(4);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test endded");
    }

    /** addFirst add the element put in argument at the beginning of the list */
    @Test
    void addFirst(){
        dLinkList.addFirst(3);
        assertEquals(3,dLinkList.ElemStart());
    }

    /** addLast add the element put in argument at the end of the list */
    @Test
    void addLast(){
        dLinkList.addLast(3);
        assertEquals(3,dLinkList.ElemEnd());
    }

    /** removeFirst remove the first element of the list */
    @Test
    <E> void removeFirst(){
        assertEquals(7, dLinkList.removeFirst());
        assertEquals(5,dLinkList.ElemStart());
    }

    /** removeLast remove the last element of the list */
    @Test
    <E> void removeLast(){
        assertEquals(4, dLinkList.removeLast());
        assertEquals(5,dLinkList.ElemEnd());
    }
}
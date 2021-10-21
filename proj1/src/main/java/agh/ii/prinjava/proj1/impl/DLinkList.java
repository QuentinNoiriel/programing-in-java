package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> Nodehead;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        private Node(T elem){
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    /**
     * We add an element at the beginnig of the list :
     * we create a node with the constructor of the Node class
     * node -> Nodehead
     * we don't forget to link the node with next and prev which serve to place the element on the list
     * @param elem
     */
    public void addFirst(E elem){
        Node<E> addNode = new Node<>(elem);
        if (Nodehead == null){
            this.Nodehead = addNode;
        }
        else if (Nodehead != null){
            Node<E> save = Nodehead;
            Nodehead= addNode;
            addNode.next = save;
            save.prev = Nodehead;
        }
    }

    /**
     * We add an element at the end of the list :
     * like for addFirst, we create a node with his constructor
     * we browse all the list until we find the end (the element which haven't another node next to him
     * we reattach our new node to next and prev
     * @param elem
     */
    public void addLast(E elem){
        Node<E> addNode = new Node<>(elem);
        if (Nodehead == null){
            this.Nodehead = addNode;
        }
        else{
            Node<E> save = Nodehead;
            while (save.next != null){
                save = save.next;
            }
            save.next = addNode;
            addNode.prev = save;
        }
    }

    /**
     * We remove the first element of a list (at the start) :
     * the first element of the list take the value of the next node
     * if this new value of the element is not equal to null, his prev node has to be equal to null
     * @return
     */
    public E removeFirst(){
        E returnValue =  null;
        if (Nodehead != null){
            returnValue = (E) Nodehead.elem;
            Nodehead = Nodehead.next;
            if (Nodehead != null){
                Nodehead.prev = null;
            }
        }
        return returnValue;
    }

    /**
     * We remove the last element of a list (at the end) :
     * We need to find the element which have a next node equal to null,
     * we give to the node prev his value and for his node the value of "null"
     * @return
     */
    public E removeLast(){

        E returnValue = null;
        if (Nodehead != null){
            if (Nodehead.next == null){
                returnValue = Nodehead.elem;
                Nodehead = null;
            }
            else{
                Node<E> save = Nodehead;
                while (save.next.next != null){
                    save = save.next;
                }
                returnValue = save.next.elem;
                save.next = null;
            }
        }
        return returnValue;
    }

    /**
     * return the value of the list as a String :
     * we create a String variable and take the value that contain each node
     * @return
     */
    @Override
    public String toString(){
        String liste = "";
        if (Nodehead == null){
            liste = liste+"null";
        }
        else {
            Node<E> save = Nodehead;
            liste = liste+save.elem;
            while (save.next != null) {
                liste = liste+" <-> "+save.next.elem;
                save = save.next;
            }
        }
        return liste;
    }

    /**
     * We find the length of a list to now if it is empty (null)
     * Or to now the place of the last element and the height of our list
     * @return
     */
    public int listLength(){
        int length = 0;
        if (Nodehead != null){
            Node<E> save = Nodehead;
            length++;
            while (save.next != null){
                length++;
                save = save.next;
            }
        }
        return length;
    }

    /**
     * We create the class Elemstart to find and save
     * the first element of our list
     * @return
     */
    public E ElemStart(){
        if (Nodehead != null){
            return Nodehead.elem;
        }
        return null;
    }

    /**
     * We create the class Elemend to find and save
     * the last element of our list
     * @return
     */
    public E ElemEnd(){
        if (Nodehead != null){
            Node<E> save = Nodehead;
            while (save.next != null){
                save = save.next;
            }
            return save.elem;
        }
        return null;
    }

}

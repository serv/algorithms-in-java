package main.queueLinkedList;

public class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> prev;
    
    public Node() {
        this.value = null;
        this.next = null;
        this.prev = null;
    }
    
    public Node(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

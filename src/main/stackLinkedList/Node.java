package main.stackLinkedList;

public class Node<T> {
    public T value;
    public Node<T> next;
    
    public Node() {
        this.value = null;
        this.next = null;
    }
    
    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}

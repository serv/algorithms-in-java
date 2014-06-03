package main.queueLinkedList;

public class Queue<T> {
    private int count;
    private Node head;
    private Node tail;
    
    public Queue() {
        this.count = 0;
    }
    
    public int size() {
        return this.count;
    }
    
    public boolean isEmpty() {
        return this.count == 0;
    }
    
    public T head() {
        return (T) this.head.value;
    }
    
    public T tail() {
        return (T) this.tail.value;
    }
    
    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        
        if(isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
        
        this.count++;
    }
    
    public T dequeue() {
        if(this.isEmpty()) {
            return null;
        } else if(this.count == 1) {
            this.count--;
            Node<T> node = this.tail;
            this.head = null;
            this.tail = null;
            return node.value;
        } else {
            this.count--;
            Node<T> node =  this.tail;
            this.tail = this.tail.prev;
            this.tail.next = null;
            return node.value;
        }
    }
}

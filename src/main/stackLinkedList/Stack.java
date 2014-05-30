package main.stackLinkedList;

public class Stack<T> {
    private Node<Object> head;
    private int count;
    
    public Node<Object> getHead() {
        return this.head;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public boolean isEmpty() {
        return (this.count == 0);
    }
    
    public void push(Object value) {
        Node<Object> node = new Node<>(value);
        node.next = (Node<Object>) this.head;
        this.head = (Node<Object>) node;
        this.count++;
    }
        
    public Object pop() {
        if(this.isEmpty()) {
            return null;
        }
        
        Object value = this.head.value;
        this.head = this.head.next;
        this.count--;
        
        return value;
    }

}

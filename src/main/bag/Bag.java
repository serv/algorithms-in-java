package main.bag;

public class Bag<T> {
    public Node<T> head;
    public int count;
    
    public Bag() {
        this.head = null;
        this.count = 0;
    }
    
    public void add(T value) {
        Node<T> node = new Node<>(value);
        
        if(this.isEmpty()) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head.next = node;
        }
        
        this.count++;
    }
    
    public boolean isEmpty() {
        return (this.size() < 1);  
    }
    
    public int size() {
        return this.count;
    }
    
    public String stringify() {
        String str = new String();
        Node<T> current = this.head;
        
        str += current.toString();
        
        while(current != null) {
            str += " " + current.value.toString();
            current = current.next;
        }
        
        return str;
    }
    
    public void print() {
        System.out.println(this.stringify());
    }
    
}

package main.stackArray;

public class Stack<T> {
    public int count;
    public int size;
    private Object[] storage;
    
    public Stack() {
        this.count = 0;
        this.size = 8;
        this.storage = new Object[this.size];
    }
    
}

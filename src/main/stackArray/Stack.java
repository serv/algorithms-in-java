package main.stackArray;

import static org.junit.Assert.assertEquals;

public class Stack<T> {
    private int count;
    private Object[] storage;
    
    public Stack() {
        this.count = 0;
        this.storage = new Object[4];
    }
    
    public int size() {
        return this.count;
    }
    
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public void push(T value) {
        if(this.count == this.storage.length) {
            this.resize(this.storage.length*2);
        }
        
        this.storage[this.count] = value; 
        this.count++;
    }
    
    public T pop() {
        if(this.isEmpty()) {
            return null;
        }
        
        T t = (T) this.storage[this.count-1];
        this.count--;
        
        if(this.storage.length/4 == this.count) {
            this.resize(this.storage.length/2);
        }
        
        return t;
    }
    
    public Object[] getStack() {
       return this.storage; 
    }
    
    private void resize(int capacity) {
        T[] newArray = (T[]) new Object[capacity];
        for(int i = 0; i < this.size(); i++) {
            newArray[i] = (T) this.storage[i];
        }
        this.storage = newArray;
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    }
}

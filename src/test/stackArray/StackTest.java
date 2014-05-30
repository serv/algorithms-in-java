package test.stackArray;

import static org.junit.Assert.*;

import org.junit.Test;

import main.stackArray.Stack;

public class StackTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.getStack().length, DELTA);
        
        stack.push(5);
        assertEquals(8, stack.getStack().length, DELTA);
        
        assertEquals(5, stack.pop(), DELTA);
        assertEquals(4, stack.pop(), DELTA);
        assertEquals(3, stack.pop(), DELTA);
        assertEquals(2, stack.pop(), DELTA);
        assertEquals(1, stack.pop(), DELTA);
    }

}

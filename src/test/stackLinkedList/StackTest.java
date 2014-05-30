package test.stackLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

import main.stackLinkedList.Stack;

public class StackTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.getCount(), DELTA);
        assertEquals(5, (Integer) stack.pop(), DELTA);
        assertEquals(4, (Integer) stack.pop(), DELTA);
        assertEquals(3, (Integer) stack.pop(), DELTA);
        assertEquals(2, (Integer) stack.pop(), DELTA);
        assertEquals(1, (Integer) stack.pop(), DELTA);
        assertEquals(0, stack.getCount(), DELTA);
    }

}

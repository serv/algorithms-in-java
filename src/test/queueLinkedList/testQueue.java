package test.queueLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

import main.queueLinkedList.Queue;

public class testQueue {
    private static final double DELTA = 1e-15;

    @Test
    public void testQueue() {
        Queue<Integer> queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.head(), DELTA);
        assertEquals(1, queue.tail(), DELTA);
        
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(4, queue.size(), DELTA);
        assertEquals(1, (Integer) queue.dequeue(), DELTA);
        assertEquals(2, (Integer) queue.dequeue(), DELTA);
        assertEquals(3, (Integer) queue.dequeue(), DELTA);
        assertEquals(4, (Integer) queue.dequeue(), DELTA);
        
    }

}

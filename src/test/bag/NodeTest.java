package test.bag;

import static org.junit.Assert.*;

import org.junit.Test;

import main.bag.Node;

public class NodeTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testNew() {
        Node<Object> node = new Node<>();
        assertEquals("failure - value is not null", null, node.value);
        
        Node<Integer> nodeInt = new Node<>(1);
        assertEquals(1, nodeInt.value, DELTA);
    }

}

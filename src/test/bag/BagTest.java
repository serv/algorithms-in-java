package test.bag;

import static org.junit.Assert.*;

import org.junit.Test;
import main.bag.Bag;

public class BagTest {

    @Test
    public void testStringify() {
        Bag<Object> bag = new Bag<>();
        assertEquals("failure - is not 0", 0, bag.size());
        
        bag.add(1);
        bag.add(2);
        bag.add(3);
        assertEquals("failure - is not 3 2 1", "3 2 1", bag.stringify());
    }

}

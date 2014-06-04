package test.sort;

import static org.junit.Assert.*;

import org.junit.Test;
import main.sort.Sort;

public class SortTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testSelection() {
        double[] doubleArray = Sort.unsortedDouble();
        assertEquals("failure - should be unsorted", false, Sort.isSortedDouble(doubleArray));
        doubleArray = Sort.selectionDouble(doubleArray);
        assertEquals("failure - should be sorted", true, Sort.isSortedDouble(doubleArray));

        int[] intArray = Sort.unsortedInt();
        assertEquals("failure - should be unsorted", false, Sort.isSortedInt(intArray));
        intArray = Sort.selectionInt(intArray);
        assertEquals("failure - should be sorted", true, Sort.isSortedInt(intArray));

    }

}

package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {
    @Test
    @DisplayName("Test case for clear()")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.clear();
        assertEquals(0, set.length());
    }

    @Test
    @DisplayName("Test case for length()")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals()")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Case 1: Two empty sets are equal
        assertTrue(set1.equals(set2), "Empty sets should be equal");

        // Case 2: Sets with the same elements in different orders are equal
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with same elements in different orders should be equal");

        // Case 3: Sets with different sizes are not equal
        set2.add(3);
        assertFalse(set1.equals(set2), "Sets with different sizes should not be equal");

        // Case 4: Sets with the same size but different elements are not equal
        set1.add(3);
        set1.add(4);
        assertFalse(set1.equals(set2), "Sets with same size but different elements should not be equal");

        // Case 5: Comparing with a null object should return false
        assertFalse(set1.equals(null), "Set should not be equal to null");

        // Case 6: Comparing with an object of a different type should return false
        assertFalse(set1.equals("not an IntegerSet"), "Set should not be equal to a non-IntegerSet object");
    }


    @Test
    @DisplayName("Test case for contains()")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for largest()")
    public void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(3, set.largest());
    }

    @Test
    @DisplayName("Test case for smallest()")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for add()")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(1);
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test case for remove()")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for union()")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2));
    }

    @Test
    @DisplayName("Test case for intersect()")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set1.intersect(set2);
        assertEquals(1, set1.length());
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for diff()")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for complement()")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set1.complement(set2);
        assertTrue(set1.contains(2) && set1.contains(3));
    }

    @Test
    @DisplayName("Test case for isEmpty()")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString()")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }

    @Test
    @DisplayName("Test exception for largest() when set is empty")
    public void testLargestException() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, set::largest);
        assertEquals("The set is empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test exception for smallest() when set is empty")
    public void testSmallestException() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, set::smallest);
        assertEquals("The set is empty", exception.getMessage());
    }
}


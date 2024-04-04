package org.howard.edu.lsp.hw5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import org.howard.edu.lsp.hw4.IntegerSet;
import org.howard.edu.lsp.hw4.IntegerSetException;

class IntegerSetTest {

    @Test
    @DisplayName("Test case for clear")
    void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    void testEquals() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(1);
        
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    @DisplayName("Test case for largest")
    void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    @DisplayName("Test case for remove")
    void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for union")
    void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2) && set1.contains(3));
    }

    @Test
    @DisplayName("Test case for intersect")
    void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        
        IntegerSet result = set1.intersect(set2);
        assertTrue(result.contains(2));
        assertFalse(result.contains(1));
        assertFalse(result.contains(3));
    }

    @Test
    @DisplayName("Test case for diff")
    void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        
        IntegerSet result = set1.diff(set2);
        assertTrue(result.contains(1));
        assertFalse(result.contains(2));
        assertFalse(result.contains(3));
    }


    

    @Test
    @DisplayName("Test case for isEmpty")
    void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }
}

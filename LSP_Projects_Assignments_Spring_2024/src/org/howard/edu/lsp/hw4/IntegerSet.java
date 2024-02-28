package org.howard.edu.lsp.hw4;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers.
 * 
 * This class provides methods to perform various operations on integer sets.
 * 
 * @author Jordan
 * @version 2/27/24
 */
public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    /**
     * Constructs an empty IntegerSet.
     */
    public IntegerSet() {
    }

    // Constructor if you want to pass in already initialized
    /**
     * Constructs an IntegerSet with initial elements from the specified list.
     * 
     * @param set the list of initial elements
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // Clears the internal representation of the set
    /**
     * Clears the set, removing all elements.
     */
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    /**
     * Returns the number of elements in the set.
     * 
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
     * they contain all of the same values in ANY order. This overrides the equal
     * method from the Object class.
     */
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof IntegerSet))
            return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    // Returns true if the set contains the value, otherwise false
    /**
     * Checks whether the set contains the specified value.
     * 
     * @param value the value to check for
     * @return true if the set contains the value, otherwise false
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set; Throws a IntegerSetException if the set
    // is empty
    /**
     * Returns the largest element in the set.
     * 
     * @return the largest element in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty())
            throw new IntegerSetException("Cannot find largest element in an empty set");
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Returns the smallest item in the set; Throws a IntegerSetException if the set
    // is empty
    /**
     * Returns the smallest element in the set.
     * 
     * @return the smallest element in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty())
            throw new IntegerSetException("Cannot find smallest element in an empty set");
        int min = Integer.MAX_VALUE;
        for (int num : set) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // Adds an item to the set or does nothing it already there
    /**
     * Adds an item to the set if it is not already present.
     * 
     * @param item the item to add
     */
    public void add(int item) {
        if (!set.contains(item))
            set.add(item);
    }

    // Removes an item from the set or does nothing if not there
    /**
     * Removes an item from the set if it is present.
     * 
     * @param item the item to remove
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    // Set union
    /**
     * Modifies the set to contain all elements from both this set and the specified set.
     * 
     * @param intSetb the set to perform union with
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num))
                set.add(num);
        }
    }

    // Set intersection, all elements in s1 and s2
    /**
     * Modifies the set to contain only elements that are present in both this set and the specified set.
     * 
     * @param intSetb the set to perform intersection with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // Set difference, i.e., s1 –s2
    /**
     * Modifies the set to contain only elements that are present in this set but not in the specified set.
     * 
     * @param intSetb the set to perform difference with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // Set complement, all elements not in s1
    /**
     * Modifies the set to contain only elements that are not present in the specified set.
     * 
     * @param intSetb the set to perform complement with
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<Integer>();
        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i) && !intSetb.set.contains(i))
                complementSet.add(i);
        }
        set = complementSet;
    }

    // Returns true if the set is empty, false otherwise
    /**
     * Checks whether the set is empty.
     * 
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set. This overrides the equal method
    // from the Object class.
    /**
     * Returns a string representation of the set.
     * 
     * @return a string representation of the set
     */
    public String toString() {
        return set.toString();
    }
}


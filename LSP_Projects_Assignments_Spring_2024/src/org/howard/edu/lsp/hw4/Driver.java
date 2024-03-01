package org.howard.edu.lsp.hw4;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        // Test cases for IntegerSet class
        
        // Test default constructor
        IntegerSet set1 = new IntegerSet();
        System.out.println("Set 1: " + set1);
        
        // Test constructor with initial elements
        IntegerSet set2 = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println("Set 2: " + set2);
        
        // Test clear method
        set1.clear();
        System.out.println("Set 1 after clear: " + set1);
        
        // Test length method
        System.out.println("Length of Set 2: " + set2.length());
        
        // Test equals method
        System.out.println("Set 1 equals Set 2: " + set1.equals(set2));
        
        // Test contains method
        System.out.println("Set 2 contains 3: " + set2.contains(3));
        
        // Test largest method
        try {
            System.out.println("Largest element in Set 2: " + set2.largest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }
        
        // Test smallest method
        try {
            System.out.println("Smallest element in Set 2: " + set2.smallest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }
        
        // Test add method
        set1.add(5);
        set1.add(6);
        System.out.println("Set 1 after adding elements: " + set1);
        
        // Test remove method
        set2.remove(3);
        System.out.println("Set 2 after removing element 3: " + set2);
        
        // Test union method
        set1.union(set2);
        System.out.println("Union of Set 1 and Set 2: " + set1);
        
        // Test intersect method
        set1.intersect(set2);
        System.out.println("Intersection of Set 1 and Set 2: " + set1);
        
        // Test diff method
        set1.diff(set2);
        System.out.println("Difference of Set 1 and Set 2: " + set1);
        
        // Test complement method
        set1.complement(set2);
        System.out.println("Complement of Set 1 with respect to Set 2: " + set1);
        
        // Test isEmpty method
        System.out.println("Is Set 1 empty? " + set1.isEmpty());
        
        // Test toString method
        System.out.println("Set 2 as String: " + set2.toString());
    }
}

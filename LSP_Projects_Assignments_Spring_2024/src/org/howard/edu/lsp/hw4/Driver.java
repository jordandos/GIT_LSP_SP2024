package org.howard.edu.lsp.hw4;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Initialize sets A and B
        ArrayList<Integer> setA = new ArrayList<>();
        setA.add(5);
        setA.add(6);
        ArrayList<Integer> setB = new ArrayList<>();
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);

        // Create IntegerSet objects
        IntegerSet A = new IntegerSet(setA);
        IntegerSet B = new IntegerSet(setB);

        // Print sets A and B
        System.out.println("Set A after adding elements: " + A);
        System.out.println("Set B after adding elements: " + B);

        // Find smallest element in set B
        try {
            System.out.println("Smallest element in Set B: " + B.smallest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }

        // Remove element 3 from set B
        B.remove(3);
        System.out.println("Set B after removing element 3: " + B);

        // Union of sets A and B
        A.union(B);
        System.out.println("Union of Set A and Set B: " + A);

        // Reset sets A and B
        A = new IntegerSet(setA);
        B = new IntegerSet(setB);

        // Intersection of sets A and B
        IntegerSet intersection = A.intersect(B);
        System.out.println("Intersection of Set A and Set B: " + intersection);

        // Reset sets A and B
        A = new IntegerSet(setA);
        B = new IntegerSet(setB);

        // Difference of sets A and B
        IntegerSet difference = A.diff(B);
        System.out.println("Difference of Set A and Set B: " + difference);
    }
}


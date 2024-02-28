package org.howard.edu.lsp.hw4;

public class Driver {
    public static void main(String[] args) {
        // Create a new IntegerSet
        IntegerSet set1 = new IntegerSet();

        // Add some elements to the set
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Print the initial state of set1
        System.out.println("Value of Set1 is: " + set1.toString());

        // Print the smallest and largest values in set1
        try {
            System.out.println("Smallest value in Set1 is: " + set1.smallest());
            System.out.println("Largest value in Set1 is: " + set1.largest());
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Create another IntegerSet
        IntegerSet set2 = new IntegerSet();

        // Add some elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Print the initial state of set2
        System.out.println("Value of Set2 is: " + set2.toString());

        // Perform union of set1 and set2
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2); // Union of set1 and set2
        System.out.println("Result of union of Set1 and Set2");
        System.out.println(set1.toString()); // Result of union of set1 and set2
    }
}

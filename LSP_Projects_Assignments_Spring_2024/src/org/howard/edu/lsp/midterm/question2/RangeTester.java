package org.howard.edu.lsp.midterm.question2;

/**
 * This class is used to test the functionality of the IntegerRange class.
 */
public class RangeTester {

    /**
     * The main method is the entry point of the RangeTester program.
     * It creates instances of IntegerRange and tests various methods provided by the IntegerRange class.
     * 
     * @param args the command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create two IntegerRange objects for testing
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);

        // Test the contains method
        System.out.println("Does range1 contain 5? " + range1.contains(5)); // Expected: true
        System.out.println("Does range2 contain 20? " + range2.contains(20)); // Expected: false

        // Test the overlaps method
        System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2)); // Expected: true

        // Test the size method
        System.out.println("Size of range1: " + range1.size()); // Expected: 10

        // Test the equals method
        System.out.println("Are range1 and range2 equal? " + range1.equals(range2)); // Expected: false

        // Create another range equal to range1 for comparison
        IntegerRange range3 = new IntegerRange(1, 10);
        System.out.println("Are range1 and range3 equal? " + range1.equals(range3)); // Expected: true
    }
}


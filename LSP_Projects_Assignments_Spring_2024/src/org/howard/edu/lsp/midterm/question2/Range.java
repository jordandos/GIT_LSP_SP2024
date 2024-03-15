package org.howard.edu.lsp.midterm.question2;

/**
 * Defines a range of values.
 */
public interface Range {

    /**
     * Checks if the range contains a given value.
     *
     * @param value the value to check
     * @return true if the range contains the value, false otherwise
     */
    boolean contains(int value);

    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check for overlap
     * @return true if there is an overlap, false otherwise
     */
    boolean overlaps(Range other);

    /**
     * Calculates the number of integers in the range.
     *
     * @return the number of integers in the range
     */
    int size();
}

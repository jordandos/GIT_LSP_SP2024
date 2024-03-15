package org.howard.edu.lsp.midterm.question2;
/**
 * Represents a range of integers.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange object with the specified lower and upper bounds.
     * 
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the range contains the given value.
     * 
     * @param value the value to check
     * @return true if the range contains the value, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if the range overlaps with another range.
     * 
     * @param other the other range to check for overlap
     * @return true if there is an overlap, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        return this.contains(((IntegerRange) other).lowerBound) ||
               this.contains(((IntegerRange) other).upperBound) ||
               other.contains(this.lowerBound) ||
               other.contains(this.upperBound);
    }

    /**
     * Calculates the number of integers in the range.
     * 
     * @return the number of integers in the range
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Checks if two ranges are equal.
     * 
     * @param obj the object to compare
     * @return true if the ranges are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegerRange)) {
            return false;
        }
        IntegerRange other = (IntegerRange) obj;
        return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
    }
}

package org.howard.edu.lsp.hw4;

/**
 * Custom exception class for IntegerSet operations.
 * 
 * This exception is thrown when an operation on an IntegerSet cannot be performed due to some specific condition.
 * 
 * @author Jordan
 * @version 2/27/24
 */
public class IntegerSetException extends Exception {
    /**
     * Constructs an IntegerSetException with the specified detail message.
     * 
     * @param message the detail message
     */
    public IntegerSetException(String message) {
        super(message);
    }
}

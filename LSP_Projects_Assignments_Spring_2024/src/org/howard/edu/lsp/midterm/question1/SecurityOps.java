package org.howard.edu.lsp.midterm.question1;

/**
 * This class provides methods for performing text encryption.
 */
public class SecurityOps {
    /**
     * Encrypts the given text by writing all of the even-index (starting at 0)
     * characters, followed by all of the odd-index characters, ignoring punctuation
     * and whitespace.
     * 
     * @param text the text to be encrypted
     * @return the encrypted text
     */
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        // Iterate through the characters in the input text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if the character is a letter or a digit
            if (Character.isLetterOrDigit(currentChar)) {
                // If the index is even, append the character to the encrypted text
                if (i % 2 == 0) {
                    encryptedText.append(currentChar);
                }
            }
        }
        // Append the odd-index characters to the encrypted text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                if (i % 2 != 0) {
                    encryptedText.append(currentChar);
                }
            }
        }
        return encryptedText.toString();
    }
}
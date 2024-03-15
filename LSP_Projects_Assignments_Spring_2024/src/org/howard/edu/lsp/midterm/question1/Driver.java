package org.howard.edu.lsp.midterm.question1;
/**
 * This class serves as the driver to demonstrate the functionality of the
 * SecurityOps class.
 */
public class Driver {
    /**
     * The main method demonstrates the usage of the SecurityOps class by encrypting
     * example texts and printing the original and encrypted texts to the console.
     * 
     * @param args the command-line arguments (unused)
     */
    public static void main(String[] args) {
        // Example 1
        String originalText1 = "I love CSCI363";
        // Encrypt the original text using the encrypt method from SecurityOps
        String encryptedText1 = SecurityOps.encrypt(originalText1);
        // Display both original and encrypted text
        System.out.println("Original Text 1: " + originalText1);
        System.out.println("Encrypted Text 1: " + encryptedText1);

        // Example 2
        String originalText2 = "Java is fun!";
        // Encrypt the original text using the encrypt method from SecurityOps
        String encryptedText2 = SecurityOps.encrypt(originalText2);
        // Display both original and encrypted text
        System.out.println("\nOriginal Text 2: " + originalText2);
        System.out.println("Encrypted Text 2: " + encryptedText2);
    }
}
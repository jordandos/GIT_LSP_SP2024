package org.howard.edu.lsp.hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private static boolean isNumeric(String word) {
        try {
            Double.parseDouble(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void processWord(String word, Map<String, Integer> wordCount) {
        word = word.toLowerCase();
        word = word.replaceAll("[^a-zA-Z']", ""); // Remove non-letter characters except apostrophes

        if (word.length() > 3 && !isNumeric(word)) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    private static Map<String, Integer> countWords(String fileContent) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] lines = fileContent.split("\\r?\\n");
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                processWord(word, wordCount);
            }
        }

        return wordCount;
    }

    private static String readFileContent(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static void printWordCount(Map<String, Integer> wordCount, String fileContent) {
        System.out.println("File Content:\n" + fileContent);
        System.out.println("\nWord Count:");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.printf("%-10s %d%n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Get the project directory dynamically
        String projectDirectory = System.getProperty("user.dir");

        // Construct the relative file path
        String relativeFilePath = "src/org/howard/edu/lsp/hw2/words.txt";
        String filePath = projectDirectory + "/" + relativeFilePath;

        // Print debug information
        System.out.println("Current working directory: " + projectDirectory);
        System.out.println("Constructed file path: " + filePath);

        // Read file content, count words, and print word count
        String fileContent = readFileContent(filePath);
        Map<String, Integer> wordCount = countWords(fileContent);
        printWordCount(wordCount, fileContent);
    }

}


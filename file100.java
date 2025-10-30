/* 
Displays a menu for the user with two options:

1. Analyze a file.
2. Exit the program.

When the user selects Analyze a File, it:
Takes the file name as input.
Reads the file line by line.

Counts:
Number of lines
Number of characters (excluding newlines)
Number of words
Number of vowels
Number of consonants
Number of digits
Number of special characters  */

import java.io.*;
import java.util.*;

public class file100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== FILE ANALYZER MENU =====");
            System.out.println("1. Analyze a File");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  			// consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the file name (with extension): ");
                    String fileName = sc.nextLine();
                    analyzeFile(fileName);
                    break;

                case 2:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 2);

        sc.close();
    }

    public static void analyzeFile(String fileName) {
        int wordCount = 0, charCount = 0, vowelCount = 0, consonantCount = 0;
        int digitCount = 0, specialCharCount = 0, lineCount = 0;

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File not found: " + fileName);
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                for (char ch : line.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        digitCount++;
                    } else if (Character.isLetter(ch)) {
                        char lower = Character.toLowerCase(ch);
                        if ("aeiou".indexOf(lower) != -1) {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    } else if (!Character.isWhitespace(ch)) {
                        specialCharCount++;
                    }
                }
            }
            br.close();

            System.out.println("\n--- Analysis for file: " + fileName + " ---");
            System.out.println("Lines: " + lineCount);
            System.out.println("Characters (excluding newlines): " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Consonants: " + consonantCount);
            System.out.println("Digits: " + digitCount);
            System.out.println("Special Characters: " + specialCharCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

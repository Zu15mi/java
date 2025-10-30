/* We can add another menu option to encrypt the file using a Caesar Cipher with a shift of +3 (cyclic). This means:
a → d, b → e, …, x → a, y → b, z → c

Similarly for uppercase letters.

Digits will also shift cyclically (e.g., 7 → 0, 8 → 1).
This happens because of cyclic shifting in digits with Caesar cipher logic:

When encrypting digits, the logic is:
	encrypted_digit = (original_digit + 3) % 10

So for 80:
First digit 8 → (8 + 3) % 10 = 11 % 10 = 1
Second digit 0 → (0 + 3) % 10 = 3
So 80 becomes 13.

Other characters (spaces, punctuation) remain unchanged. 

type input.txt to show file in cmd.
*/


import java.io.*;
import java.util.*;

public class file102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== FILE ANALYZER MENU =====");
            System.out.println("1. Analyze a File");
            System.out.println("2. Encrypt a File (Caesar Cipher +3)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the file name (with extension): ");
                    String fileName = sc.nextLine();
                    analyzeFile(fileName);
                    break;

                case 2:
                    System.out.print("Enter the file name to encrypt: ");
                    String inputFile = sc.nextLine();
                    System.out.print("Enter the output file name for encrypted text: ");
                    String outputFile = sc.nextLine();
                    encryptFile(inputFile, outputFile);
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

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

    public static void encryptFile(String inputFile, String outputFile) {
        try {
            File file = new File(inputFile);
            if (!file.exists()) {
                System.out.println("File not found: " + inputFile);
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = br.readLine()) != null) {
                StringBuilder encrypted = new StringBuilder();

                for (char ch : line.toCharArray()) {
                    if (Character.isUpperCase(ch)) {
                        encrypted.append((char) ('A' + (ch - 'A' + 3) % 26));
                    } else if (Character.isLowerCase(ch)) {
                        encrypted.append((char) ('a' + (ch - 'a' + 3) % 26));
                    } else if (Character.isDigit(ch)) {
                        encrypted.append((char) ('0' + (ch - '0' + 3) % 10));
                    } else {
                        encrypted.append(ch); // keep special characters unchanged
                    }
                }
                bw.write(encrypted.toString());
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("File encrypted successfully! Output saved in: " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred while encrypting the file.");
            e.printStackTrace();
        }
    }
}

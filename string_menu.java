import java.util.Scanner;

public class string_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont;

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Reverse a String");
            System.out.println("2. Count Vowels");
            System.out.println("3. Check Anagram");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = sc.nextLine();
                    String rev = "";
                    for (int i = str1.length() - 1; i >= 0; i--) {
                        rev += str1.charAt(i);
                    }
                    System.out.println("Reversed String: " + rev);
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    String str2 = sc.nextLine().toLowerCase();
                    int vowels = 0;
                    for (int i = 0; i < str2.length(); i++) {
                        char ch = str2.charAt(i);
                        if ("aeiou".indexOf(ch) != -1) vowels++;
                    }
                    System.out.println("Number of vowels: " + vowels);
                    break;

                case 3:
                    System.out.print("Enter first string: ");
                    String a = sc.nextLine().toLowerCase().replaceAll("\\s", "");
                    System.out.print("Enter second string: ");
                    String b = sc.nextLine().toLowerCase().replaceAll("\\s", "");

                    if (a.length() != b.length()) {
                        System.out.println("Not anagrams.");
                    } else {
                        char[] arr1 = a.toCharArray();
                        char[] arr2 = b.toCharArray();
                        java.util.Arrays.sort(arr1);
                        java.util.Arrays.sort(arr2);
                        if (java.util.Arrays.equals(arr1, arr2)) {
                            System.out.println("Strings are anagrams.");
                        } else {
                            System.out.println("Strings are not anagrams.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            cont = sc.nextLine().toUpperCase().charAt(0);

        } while (cont == 'Y');

        System.out.println("Program ended.");
        sc.close();
    }
}
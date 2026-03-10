import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("Initialized Successfully");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string to check: ");
        String input = sc.nextLine();

        if (checkPalindromeLogic(input)) {
            System.out.println("Result: '" + input + "' is a palindrome!");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        sc.close();
    }

    public static boolean checkPalindromeLogic(String str) {
        if (str == null || str.isEmpty()) return false;

        String clean = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void stringReversal(String str) {
            if (str == null || str.isEmpty()) {
                System.out.println("Input is empty.");
                return;
            }

            // Prepare the string (remove non-alphanumeric and lowercase)
            String clean = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            String reversed = "";

            for (int i = clean.length() - 1; i >= 0; i--) {
                reversed = reversed + clean.charAt(i);
            }

            if (clean.equals(reversed)) {
                System.out.println("Result: '" + str + "' is a palindrome!");
            } else {
                System.out.println("Result: '" + str + "' is NOT a palindrome.");
            }
        }
    }

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("Initialized Successfully");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string to check: ");
        String input = sc.nextLine();

        // Calling the logic method
        if (checkPalindromeLogic(input)) {
            System.out.println("Result: '" + input + "' is a palindrome!");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        sc.close();
    }

    // Branch 2 Implementation: Two-pointer approach
    public static boolean checkPalindromeLogic(String str) {
        if (str == null || str.isEmpty()) return false;

        // Clean the string (lowercase and remove non-alphanumeric if desired)
        String clean = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }
    public static boolean checkPalindromeArray(String str) {
        if (str == null) return false;

        char[] chars = str.toLowerCase().toCharArray();

        int start = 0;

        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        return isPalindrome;
    }

}
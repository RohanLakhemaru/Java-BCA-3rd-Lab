package lab7;
import java.util.Scanner;

public class PalindromeCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Reverse the word using string handling
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        // Display the reversed word
        System.out.println("Reversed word: " + reversedWord);

        // Check if the word is a palindrome
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        scanner.close();
    }
}

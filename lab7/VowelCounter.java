package lab7;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        input = input.toLowerCase();

        // Count the number of vowels in the string
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Display the number of vowels
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}

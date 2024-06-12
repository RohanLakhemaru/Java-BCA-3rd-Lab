package lab7;

import java.util.Scanner;

public class CountriesEndingWithVowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store country names
        String[] countries = new String[5];

        // Input the names of 5 countries
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of country " + (i + 1) + ": ");
            countries[i] = scanner.nextLine();
        }

        // Display countries ending with a vowel
        System.out.println("Countries ending with a vowel:");
        for (String country : countries) {
            if (endsWithVowel(country)) {
                System.out.println(country);
            }
        }

        scanner.close();
    }

    // Method to check if a string ends with a vowel
    public static boolean endsWithVowel(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return "AEIOUaeiou".indexOf(lastChar) != -1;
    }
}

package lab7;

import java.util.Scanner;

public class NameStartsWithR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input names into an array
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Display names starting with "R"
        System.out.println("\nNames starting with 'R':");
        for (String name : names) {
            if (name.toLowerCase().startsWith("r")) {
                System.out.println(name);
            }
        }

        scanner.close();
    }
}


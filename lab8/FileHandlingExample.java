package lab8;

import java.io.*;
import java.util.Scanner;

public class FileHandlingExample {

    // Method to write input text to a file
    public static void writeToFile(String filename, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read from a file and display its contents
    public static void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a line of text from the user
        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Define the filename
        String filename = "sample.txt";

        // Write the input text to the file
        writeToFile(filename, inputText);

        // Read from the file and display its contents
        readFromFile(filename);

        scanner.close();
    }
}

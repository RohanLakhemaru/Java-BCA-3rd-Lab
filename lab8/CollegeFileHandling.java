package lab8;
import java.io.*;
import java.util.Scanner;

public class CollegeFileHandling {

    // Method to write college data to a file
    public static void writeToFile(String filename, String[] collegeNames, int[] studentNumbers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < collegeNames.length; i++) {
                writer.write(collegeNames[i] + "," + studentNumbers[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read from a file and display colleges with more than 500 students
    public static void readFromFileAndDisplay(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Colleges with more than 500 students:");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String collegeName = parts[0];
                int studentNumber = Integer.parseInt(parts[1]);

                if (studentNumber > 500) {
                    System.out.println(collegeName);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] collegeNames = new String[10];
        int[] studentNumbers = new int[10];

        // Input the name and number of students for 10 colleges
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of college " + (i + 1) + ": ");
            collegeNames[i] = scanner.nextLine();

            System.out.print("Enter the number of students in " + collegeNames[i] + ": ");
            studentNumbers[i] = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
        }

        // Define the filename
        String filename = "colleges.txt";

        // Write the college data to the file
        writeToFile(filename, collegeNames, studentNumbers);

        // Read from the file and display colleges with more than 500 students
        readFromFileAndDisplay(filename);

        scanner.close();
    }
}

package lab8;

import java.io.*;

public class FileCopyExample {

    // Method to copy content from one file to another
    public static void copyFile(String sourceFile, String destFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
        } catch (IOException e) {
            System.out.println("An error occurred during the file copy process.");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        String sourceFile = "university.txt";
        String destFile = "college.txt";

        // Copy content from "university.txt" to "college.txt"
        copyFile(sourceFile, destFile);
    }
}

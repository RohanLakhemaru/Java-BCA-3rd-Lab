package lab5;
import java.io.FileNotFoundException;

public class ThrowsExample {

    // A method that throws a checked exception
    public static void readFile() throws FileNotFoundException {
        throw new FileNotFoundException("File not found!");
    }

    // Main method to demonstrate calling the readFile method
    public static void main(String[] args) {
        try {
            // Call the readFile method
            readFile();
        } catch (FileNotFoundException e) {
            // Handle the exception thrown by readFile method
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}

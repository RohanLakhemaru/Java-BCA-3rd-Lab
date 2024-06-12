package lab5;
import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 10: ");
        int number = sc.nextInt();

       class MyCustomException extends Exception {
            // Constructor that accepts a message
            public MyCustomException(String message) {
                super(message);
            }
        }
        
        
        try {
            // Check if the number is within the valid range
            if (number < 1 || number > 10) {
                // Throw custom exception if number is out of range
                throw new MyCustomException("Number out of range! Please enter a number between 1 and 10.");
            }
            // If the number is valid, print a success message
            System.out.println("You entered a valid number: " + number);
        } catch (MyCustomException e) {
            // Catch and handle the custom exception
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}

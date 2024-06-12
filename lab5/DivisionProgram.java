package lab5;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input first integer
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        
        // Input second integer
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        
        // Try to perform division and handle ArithmeticException
        try {
            int result = num1 / num2;
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        sc.close();
    }
}

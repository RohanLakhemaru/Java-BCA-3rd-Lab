package lab4;
import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to return the area of the rectangle
    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        // Prompt the user to enter the breadth
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        // Create an Area object
        Area rectangle = new Area(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.returnArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}

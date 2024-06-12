//1.Create an array to store 10 numbers and find the sum of only those numbers whose last digit is 1.
import java.util.Scanner;
import java.util.Arrays;

public class SumLastDigitOne {
    public static void main(String[] args) {
        // Initialize the array with 10 numbers
        int[] numbers = {21, 34, 11, 45, 61, 72, 81, 19, 31, 41};
        
        // Variable to store the sum of numbers whose last digit is 1
        int sum = 0;

        // Loop through each number in the array
        for (int number : numbers) {
            // Check if the last digit is 1
            if (number % 10 == 1) {
                // Add the number to the sum
                sum += number;
            }
        }

        // Print the result
        System.out.println("The sum of numbers whose last digit is 1 is: " + sum);
    }
}

//2.Create an array to store 10 numbers in an array and find the greatest and smallest number.
class FindMinMax {
    public static void main(String[] args) {
        // Initialize the array with 10 numbers
        int[] numbers = {21, 34, 11, 45, 61, 72, 81, 19, 31, 41};
        
        // Assume the first element is both the smallest and the greatest
        int min = numbers[0];
        int max = numbers[0];

        // Loop through each number in the array
        for (int number : numbers) {
            // Check if the current number is smaller than the current min
            if (number < min) {
                min = number;
            }
            // Check if the current number is greater than the current max
            if (number > max) {
                max = number;
            }
        }

        // Print the result
        System.out.println("The smallest number is: " + min);
        System.out.println("The greatest number is: " + max);
    }
}

//3.Create an array to store 10 numbers and sort them in ascending order.

class SortArray {
    public static void main(String[] args) {
        // Initialize the array with 10 numbers
        int[] numbers = {21, 34, 11, 45, 61, 72, 81, 19, 31, 41};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("The sorted array in ascending order is: " + Arrays.toString(numbers));
    }
}
//4.Write a program to print the diagonal elements of a matrix.
class DiagonalElements {
    public static void main(String[] args) {
        // Initialize the matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print primary diagonal elements
        System.out.print("Primary diagonal elements: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        // Print secondary diagonal elements
        System.out.print("Secondary diagonal elements: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
        System.out.println();
    }
}
//5.Write a program to find sum of two 3x4 matrices.
class MatrixSum {
    public static void main(String[] args) {
        // Define the matrices
        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[][] matrix2 = {
            {13, 14, 15, 16},
            {17, 18, 19, 20},
            {21, 22, 23, 24}
        };

        // Create a new matrix to store the sum
        int[][] sumMatrix = new int[3][4];

        // Iterate over each element in the matrices and compute the sum
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the sum matrix
        System.out.println("Sum of the matrices:");
        printMatrix(sumMatrix);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
